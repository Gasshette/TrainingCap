{
    "use strict";
    class HeaderController {
        constructor() {

        }
    }

    angular.module('app')
        .component("headerComponent", {
            controller: HeaderController,
            templateUrl: "app/components/header/header.comp.html"
        });
}