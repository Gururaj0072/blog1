var app = angular.module('blogApp', []);
app.controller('blogCtrl', function($scope, $http) {
    var conf = new config();
    $http.get(conf.get_blogs()).then(function(response) {
    	alert("Value of token stored is" + response.data);
    	$scope.records = response.data;
    });
});
