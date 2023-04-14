
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AaaManager from "./components/listers/AaaCards"
import AaaDetail from "./components/listers/AaaDetail"

import BbbManager from "./components/listers/BbbCards"
import BbbDetail from "./components/listers/BbbDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/aaas',
                name: 'AaaManager',
                component: AaaManager
            },
            {
                path: '/aaas/:id',
                name: 'AaaDetail',
                component: AaaDetail
            },

            {
                path: '/bbbs',
                name: 'BbbManager',
                component: BbbManager
            },
            {
                path: '/bbbs/:id',
                name: 'BbbDetail',
                component: BbbDetail
            },



    ]
})
