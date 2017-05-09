{
    "use strict";
    class ConnectionController {
        constructor() {
            console.log("connexion");
        }
    }

    angular.module('app')
        .component('connectionComponent', {
            controller: ConnectionController,
            templateUrl: 'app/components/connection/connection.comp.html'
        });
}