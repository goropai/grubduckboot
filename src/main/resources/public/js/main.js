var app = angular.module("springDemo", []);

app.controller("AppCtrl", function ($scope, $http) {
    $scope.websites = [];
    $http.get('http://localhost:8099/api/sites').success(function(data) {
            $scope.websites = data;
    });
});