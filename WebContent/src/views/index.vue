<style scoped>
    .index {
        width: 100%;
        position: absolute;
        top: 0;
        bottom: 0;
        left: 0;
        text-align: left;
    }

    .index h2 ,.index .posts p{
        color: #666;
    }
    .index .posts p{
        line-height: 30px;
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
.service{
    width:160px;
    height: 160px;
    border-radius:80px;
    line-height: 60px;
    font-size: 20px;
    padding: 20px 0;
    display: inline-block;
    margin:0 18px;
    color: white;
}
    .onlineservice{
        text-align: center;
        padding: 30px 0;
    }
    .onlineservice button{
        background: white;
        width: 120px;
    }
    .QRcode{
        float: right;
        margin-right: -140px;
    }
    .QRcode img{
        width: 100%;
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
                <div class="QRcode">
                    <Card style="width:132px;margin-bottom: 20px;">
                        <div style="text-align:center">
                            <p>下载园区生活</p>
                            <img src="https://raw.githubusercontent.com/iview/iview/master/assets/logo.png">
                        </div>
                    </Card>
                    <Card style="width:132px">
                        <div style="text-align:center">
                            <p>关注园区公众号</p>
                            <img src="https://raw.githubusercontent.com/iview/iview/master/assets/logo.png">
                        </div>
                    </Card>
                </div>
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
                        <div class="posts">
                            <Tabs value="园区公告">
                                <TabPane label="园区公告" name="园区公告">
                                    <router-link to="/"><h2>关于开展国家级服务外包公共服务平台专项资金申报工作的通知</h2></router-link>
                                    <router-link to="/"><p>关于开展国家级服务外包公共服务的通知 <span class="right">2017.12.21</span> </p></router-link>
                                    <router-link to="/"><p>关于开展国家级服务外包公共服务的通知 <span class="right">2017.12.21</span> </p></router-link>
                                    <router-link to="/"><p>关于开展国家级服务外包公共服务的通知 <span class="right">2017.12.21</span> </p></router-link>
                                    <router-link to="/"><p>关于开展国家级服务外包公共服务的通知 <span class="right">2017.12.21</span> </p></router-link>
                                    <router-link to="/"><p>关于开展国家级服务外包公共服务的通知 <span class="right">2017.12.21</span> </p></router-link>
                                    <router-link to="/"><p>关于开展国家级服务外包公共服务的通知 <span class="right">2017.12.21</span> </p></router-link>
                                    <router-link to="/"><p>关于开展国家级服务外包公共服务的通知 <span class="right">2017.12.21</span> </p></router-link>
                                </TabPane>
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
                        <TabPane label="园区介绍" name="园区介绍">
                            <Row>
                                <Col span="14">
                                    <img style="width: 100%" src="https://inews.gtimg.com/newsapp_bt/0/3289579916/1000" alt="">
                                </Col>
                                <Col span="8">
                                  <div>xxxxxxxxxxxxxxxxxxxxxxxxxxxxx</div>
                                  <div>xxxxxxxxxxxxxxxxxxxxxxxxxxxxx</div>
                                </Col>
                            </Row>
                            <Row>
                                <Col span="6">
                                <div>xxxxxxxxxxxxxxxxxxxxxxxxxxxxx</div>
                                </Col>
                                <Col span="18">
                                <img style="width: 100%" src="https://inews.gtimg.com/newsapp_bt/0/3289579916/1000" alt="">
                                </Col>
                            </Row>
                            <Row type="flex" justify="center" align="top" class="code-row-bg">
                                <Col span="4"><p style="height: 80px">col-4</p></Col>
                                <Col span="4"><p style="height: 30px">col-4</p></Col>
                                <Col span="4"><p style="height: 100px">col-4</p></Col>
                                <Col span="4"><p style="height: 60px">col-4</p></Col>
                            </Row>
                        </TabPane>
                    </Tabs>
                </Col>
            </Row>
            <Row type="flex" justify="center" align="top">
                <Col span="14">
                <Tabs value="在线服务">
                    <TabPane label="在线服务" name="在线服务">
                        <div class="onlineservice" style="background: #6d7380">
                            <router-link to="/">
                                <div class="service" style="background: #c78e23">
                                    <Icon type="document-text"></Icon>
                                    <br>服务项目
                                </div>
                            </router-link>
                            <router-link to="/">
                                <div class="service" style="background: #4fbd8c">
                                    <Icon type="document-text"></Icon>
                                    <br>项目申报
                                </div>
                            </router-link>
                            <router-link to="/">
                                <div class="service" style="background: #3594d8">
                                    <Icon type="document-text"></Icon>
                                    <br>经营数据上报
                                </div>
                            </router-link>
                            <br>
                            <router-link to="/">
                                <div class="service" style="background: #72a3f0;margin-right:18px;margin-top:-30px;">
                                    <Icon type="document-text"></Icon>
                                    <br>续租退租申请
                                </div>
                            </router-link>
                            <router-link to="/">
                                <div class="service" style="background: #96549e;margin-left:18px;margin-top:-30px;">
                                    <Icon type="document-text"></Icon>
                                    <br>装修申请
                                </div>
                            </router-link>
                            <br>
                            <Button type="ghost"  shape="circle">更多服务</Button>
                        </div>
                    </TabPane>
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