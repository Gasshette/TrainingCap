{
    "use strict";
    class HomeController {
        constructor() {

        }
    }

    angular.module('app')
        .component('homeComponent', {
            controller: HomeController,
            templateUrl: 'app/home.html'
        });
}