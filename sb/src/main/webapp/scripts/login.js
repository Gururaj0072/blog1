var app = angular.module('loginApp', []);
app.controller('loginCtrl', function($scope, $http) {
    var conf = new config();
    $scope.myFunction = function() {
        var parameter = JSON.stringify({type:"user", username:$scope.loginInput, password:$scope.loginPassword});
        alert (parameter);
        $http.get(conf.get_login($scope.loginInput, $scope.loginPassword)).then(function(response) {
            localStorage.setItem("token", response.data.token);
        	alert("Value of token stored is" + response.data.token);
        });
        alert("Local storage is " + localStorage.getItem("token"));
    }
});
