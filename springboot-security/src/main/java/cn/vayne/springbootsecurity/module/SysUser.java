package cn.vayne.springbootsecurity.module;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2018/4/17 下午3:34
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
@Entity
@Setter
@Getter
public class SysUser implements UserDetails {

	private static final long serialVersionUID = 4104764873840302511L;

	@Id
	@GeneratedValue
	private Long id;

	private String username;

	private String password;

	@ManyToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.EAGER)
	private List<SysRole> roles;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
		List<SysRole> sysRoles = this.getRoles();
		sysRoles.stream().forEach(e -> {
			grantedAuthorities.add(new SimpleGrantedAuthority(e.getName()));
		});
		return grantedAuthorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
