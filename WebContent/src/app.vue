<template>
    <div>
        <router-view></router-view>
    </div>
</template>
<script>
    export default {
        data() {
            return {

            };
        },
        mounted() {

        },
        beforeDestroy() {

        },
        methods: {

        }
    };
</script>
<style>
    #app {
        font-family: 'Avenir', Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
    }
    .left{
        float: left;
    }
    .right{
        float: right;
    }
    li {
        list-style: none;
    }
    a, a:hover {
        text-decoration: none;
    }
    .inline{
        display: inline-block;
    }
    #announcement ul.ivu-carousel-dots.ivu-carousel-dots-inside{
        width: 22%;
        right: 0;
    }

</style>