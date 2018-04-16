<style scoped>
    .index {
        width: 100%;
        position: absolute;
        top: 0;
        bottom: 0;
        left: 0;
        text-align: center;
    }

    .index h1 {
        height: 150px;
    }

    .index h1 img {
        height: 100%;
    }

    .index h2 {
        color: #666;
        margin-bottom: 200px;
    }

    .index h2 p {
        margin: 0 0 50px;
    }

    .index .ivu-row-flex {
        height: 100%;
    }
</style>
<template>
    <div class="index">
        <Layout width="100%">
            <Sider hide-trigger
                   breakpoint="sm"
                   width="300"
                   collapsed-width="0">Sider</Sider>
            <TopHeader></TopHeader>
            <Input v-model="value1" icon="ios-search" placeholder="Enter something..." style="width: 200px"></Input>
        </Layout>
        <Row type="flex" justify="center" align="middle">
            <Col span="24">
            <div class="glide">
                <div class="glide__track" data-glide-el="track">
                    <ul class="glide__slides">
                        <li class="glide__slide">0</li>
                        <li class="glide__slide">1</li>
                        <li class="glide__slide">2</li>
                    </ul>
                </div>
            </div>
                <h1>
                    <img src="https://raw.githubusercontent.com/iview/iview/master/assets/logo.png">
                </h1>
                <h2>
                    <p>Welcome to your iView app!!!</p>
                    <Button type="ghost" @click="handleStart">Start iView</Button>
                </h2>
            </Col>
        </Row>
        <Footer></Footer>
    </div>
</template>
<script>
    import TopHeader from  './components/TopHeader'
    import Footer from  './components/Footer'
    import Glide from '@glidejs/glide'

    export default {
        components:{
            TopHeader,
            Footer
        },
        data () {
            return {
                value1: ''
            }
        },
        mounted() {
            new Glide('.glide').mount()
        },
        methods: {
            handleStart() {
                this.$Modal.info({
                    title: 'Bravo',
                    content: 'Now, enjoy the convenience of iView.'
                });
            }
        }
    };
</script>