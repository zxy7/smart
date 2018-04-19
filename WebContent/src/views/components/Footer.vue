<template>
    <div id="footer">
        <Row type="flex" justify="center" align="top" class="code-row-bg">
            <Col span="12">
                <div style="height: 80px">
                    <h2>江宁九龙湖国际企业总部园</h2>
                    <p class="darkcolor">JIANGNING JIULONGHU</p>
                    <p class="darkcolor">INTERNATIONAL HEADQUARTERS PARK</p>
                    <br>
                    <Row>
                        <Col span="6">
                            <p>园区地址/ADDR   </p>
                            <p>招商热线/TEL   </p>
                            <p>传真信息/FAX   </p>
                        </Col>
                        <Col span="18" style="color: #0492c6;font-weight: 800">
                            <p>江苏省南京市江宁开发区苏源大道19号       211106   </p>
                            <p>(86)025-52727777 </p>
                            <p>(86)025-52730055 </p>
                        </Col>
                    </Row>
                    <Row  type="flex" align="bottom">
                        <Col span="6">
                        <img src="https://raw.githubusercontent.com/iview/iview/master/assets/logo.png" alt="">
                        </Col>
                        <Col span="18" style="padding-bottom: 10px;">
                        微信扫一扫 <br>
                        即刻关注我们
                        </Col>
                    </Row>
                    <p>©2018 江宁九龙湖国际总部园 苏ICP备15032369号-1</p>
                </div>
            </Col>
            <Col span="6">
                <div style="height: 160px;border-left: 1px white solid;padding-left: 20px;">
                    <h3 class="darkcolor">站内信息</h3>
                    <router-link to="/"><p>关于我们/About us</p></router-link>
                    <a href=""><p>园区信箱/EMail</p></a>
                    <a href=""><p>隐私条款/Privacy</p></a>
                    <a href=""><p>法律声明/Permission</p></a>
                    <a href=""><p>人才招聘/Jobs</p></a>
                </div>
            </Col>
            <Col span="6">
                <div style="height: 160px;border-left: 1px white solid;padding-left: 20px;">
                    <h3 class="darkcolor">友情链接</h3>
                    <a href=""><p>南京市政府</p></a>
                    <a href=""><p>江宁区政府</p></a>
                    <a href=""><p>江宁开发区</p></a>
                    <a href=""><p>中国开发区协会</p></a>
                    <a href=""><p>江苏开发区协会</p></a>
                    <a href=""><p>北京开发区协会</p></a>
                    <a href=""><p>江宁人事人才网</p></a>
                </div>
            </Col>
        </Row>
    </div>

</template>

<script>
    export default {
        name: "homefooter"
    }
</script>

<style scoped>
#footer{
    background: #222222;
    color: white;
    height: 300px;
    margin-top: 30px;
    padding: 50px;
}
    #footer img{
        width: 100px;
    }
    #footer a{
        color: white;
    }
    .darkcolor{
        color: #656565;
    }
</style>