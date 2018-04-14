var actionApp = angular.module('actionApp',['ngRoute']);
actionApp.config(function ($routeProvider,$locationProvider) {
	$locationProvider.hashPrefix('');
	$routeProvider.when('/oper',{
		controller : 'View1Controller',
		templateUrl : 'view/view1.html'

	}).when('/directive',{
		controller : 'View2Controller',
		templateUrl : 'view/view2.html'
	});
});



