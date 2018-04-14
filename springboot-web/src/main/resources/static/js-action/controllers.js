actionApp.controller('View1Controller',function ($scope, $http) {
	$scope.$on('$viewContentLoaded',function () {
		console.log('页面加载完成');
	});
	$scope.search = function () {
		personName = $scope.personName;
		$http.get('search', {
			params: {
				personName : personName
			}
		}).then(function (result) {
			console.info(result.data);
			$scope.person = {};
			$scope.person = result.data;
		}).catch(function (result) {
			console.info(result);
		});
	}
})
.controller('View2Controller',function ($scope) {
	$scope.$on('$viewContentLoaded', function () {
		console.log('页面加载完成');
	})
});