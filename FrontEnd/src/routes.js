angular
  .module('app')
  .config(routesConfig);

/** @ngInject */
function routesConfig($stateProvider, $urlRouterProvider, $locationProvider) {
  $locationProvider.html5Mode(true).hashPrefix('!');
  $urlRouterProvider.otherwise('/');

  let home = {
    name: 'home',
    url: '/',
    component: 'homeComponent'
  }

  let connection = {
    name: 'connection',
    url: '/connect',
    component: 'connectionComponent'
  }

  let inscription = {
    name: 'inscription',
    url: '/signin',
    component: 'inscriptionComponent'
  }

  $stateProvider.state(home);
  $stateProvider.state(connection);
  $stateProvider.state(inscription);
}
