package cn.vayne.springbootwebsocket.common;



/**
 * @Author: WangKun
 * @Description: spring security的简单配置
 * @Date: Created in 2018/3/27 下午4:15
 * @ProjectName: vayne-springboot02
 * @Version: 1.0.0
 */
/*@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
				.inMemoryAuthentication()
				.withUser("vayne").password("095430").roles("USER")
				.and()
				.withUser("wangkun").password("1234qaQA").roles("USER");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/resources/static/**");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
				.antMatchers("/","/login").permitAll()
				.anyRequest().authenticated()
				.and()
				.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/chat")
				.permitAll()
				.and()
				.logout()
				.permitAll();
	}
}*/
