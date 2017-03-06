var app = angular.module('blogCreateApp', []);
app.controller('blogCreateCtrl', function($scope, $http) {
    var conf = new config();
    $scope.myFunction = function() {
        $http.get(conf.create_blog($scope.blogTitle, $scope.blogContent, localStorage.getItem("token"))).then(function(response) {
        	alert("Content is stored successfully in db");
        });
    }
});
