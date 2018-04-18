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
    .slider__arrow--prev {
        left: -4rem;
    }
    .slider__arrow--next {
        right: -4rem;
    }
    .glide__arrow{
        color: #6d7380;
    }
    .demo-title{
        height: 46px;
        line-height: 46px;
        color: #fff;
        background: #000;
        opacity: 0.5;
        text-align: left;
        margin-top: -50px;
        padding-left: 20px;
    }


</style>
<template>
    <div class="index">
        <Header></Header>
        <div style="width: 100%;height: 220px;">
            <img style="width: 100%;"  src="./img/header-banner.jpg" alt="">
        </div>
        <div>
            <Row type="flex" justify="center" align="top">
                <Col span="14">
                <Tabs value="园区动态">
                    <TabPane label="园区动态" name="园区动态"></TabPane>
                    <div slot="extra">更多</div>
                </Tabs>
                <div class="glide">
                    <div class="glide__track" data-glide-el="track">
                        <ul class="glide__slides">
                            <li class="glide__slide" v-for="(newsitem,index) in newsList" :key="index">
                                <Card>
                                    <p slot="title">{{newsitem.title}}</p>
                                    <p>
                                        <Row type="flex">
                                            <Col span="8">{{newsitem.name}}</Col>
                                            <Col span="1">|</Col>
                                            <Col span="15">{{newsitem.time}}</Col>
                                        </Row>
                                    </p>
                                    <img :src="newsitem.image" style="height: 100px;" alt="">
                                </Card>
                            </li>
                        </ul>
                    </div>
                    <div data-glide-el="controls">
                        <button class="slider__arrow slider__arrow--prev glide__arrow glide__arrow--prev" data-glide-dir="<"><Icon type="chevron-left"></Icon></button>
                        <button class="slider__arrow slider__arrow--next glide__arrow glide__arrow--next" data-glide-dir=">"><Icon type="chevron-right"></Icon></button>
                    </div>
                </div>
                </Col>
            </Row>
            <Row type="flex" justify="center" align="top">
                <Col span="14">
                <Tabs value="通知公告">
                    <TabPane label="通知公告" name="通知公告"></TabPane>
                    <div slot="extra">更多</div>
                </Tabs>
                <Row :gutter="16">
                    <Col span="14">
                        <div>
                            <Carousel id="announcement" dots="inside" v-model="value1" loop>
                                <CarouselItem>
                                    <div class="demo-carousel">
                                    <!--<div class="demo-carousel" style="background: url('https://inews.gtimg.com/newsapp_bt/0/3289579916/1000')">-->
                                        <img style="height: 360px;width: 100%;" src="https://inews.gtimg.com/newsapp_bt/0/3289579916/1000" alt="">
                                        <div class="demo-title">江宁开发区开展餐饮场所燃气安全专项整治行动</div>
                                    </div>
                                </CarouselItem>
                                <CarouselItem>
                                    <div class="demo-carousel">2</div>
                                </CarouselItem>
                                <CarouselItem>
                                    <div class="demo-carousel">3</div>
                                </CarouselItem>
                                <CarouselItem>
                                    <div class="demo-carousel">4</div>
                                </CarouselItem>
                            </Carousel>
                        </div>
                    </Col>
                    <Col span="10">
                        <div>
                            <Tabs value="园区公告">
                                <TabPane label="园区公告" name="园区公告">标签一的内容</TabPane>
                                <TabPane label="招租动态" name="招租动态">标签二的内容</TabPane>
                                <TabPane label="企业动态" name="企业动态">标签三的内容</TabPane>
                            </Tabs>
                        </div>
                    </Col>
                </Row>
                </Col>
            </Row>
            <Row type="flex" justify="center" align="top">
                <Col span="14">
                    <Tabs value="园区介绍">
                        <TabPane label="园区介绍" name="园区介绍"></TabPane>
                    </Tabs>
                </Col>
            </Row>
            <Row type="flex" justify="center" align="top">
                <Col span="14">
                <Tabs value="在线服务">
                    <TabPane label="在线服务" name="在线服务"></TabPane>
                </Tabs>
                </Col>
            </Row>
        </div>
        <Footer></Footer>
    </div>
</template>
<script>
    import Header from  './components/Header'
    import Footer from  './components/Footer'
    import Glide from '@glidejs/glide'

    export default {
        components:{
            Header,
            Footer
        },
        data () {
            return {
                newsList:[
                    {title:"江宁开发区305亿重大项目集中签约",name:'admin',time:"2017.1.2 12:23:32",image:"https://raw.githubusercontent.com/iview/iview/master/assets/logo.png"},
                    {title:"江宁开发区305亿重大项目集中签约",name:'admin',time:"2017.1.2 12:23:32",image:"https://raw.githubusercontent.com/iview/iview/master/assets/logo.png"},
                    {title:"江宁开发区305亿重大项目集中签约",name:'admin',time:"2017.1.2 12:23:32",image:"https://raw.githubusercontent.com/iview/iview/master/assets/logo.png"},
                    {title:"江宁开发区305亿重大项目集中签约",name:'admin',time:"2017.1.2 12:23:32",image:"https://raw.githubusercontent.com/iview/iview/master/assets/logo.png"},
                    {title:"江宁开发区305亿重大项目集中签约",name:'admin',time:"2017.1.2 12:23:32",image:"https://raw.githubusercontent.com/iview/iview/master/assets/logo.png"},
                    {title:"江宁开发区305亿重大项目集中签约",name:'admin',time:"2017.1.2 12:23:32",image:"https://raw.githubusercontent.com/iview/iview/master/assets/logo.png"},
                ],
                value1:0
            }
        },
        mounted() {
            new Glide('.glide',{
                startAt: 0,
                perView: 4
            }).mount()
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