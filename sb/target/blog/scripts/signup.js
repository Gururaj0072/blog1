var app = angular.module('signupApp', []);
app.controller('signupCtrl', function($scope, $http) {
    var conf = new config();
    $scope.myFunction = function() {
        $http.get(conf.get_user_create($scope.loginInput, $scope.loginPassword, $scope.name, $scope.email, $scope.phnumber)).then(function(response) {
            localStorage.setItem("token", response.data.token);
        	alert("Value of token stored is" + response.data.token);
        });
        alert("Local storage is " + localStorage.getItem("token"));
    }
});
