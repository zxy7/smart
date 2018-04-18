<template>
    <div>
        <div class="tophead">
            <span>欢迎访问九龙湖总部园</span>
            <span class="right">下载中心</span>
        </div>
        <row type="flex"  justify="center" align="top" class="code-row-bg">
            <col span="6">
                <p class="headname">江宁开发区  <br>   九龙湖国际企业总部园  </p>
            </col>
            <col span="12">
            <Menu mode="horizontal" theme="light"   :active-name="0">
                <MenuItem v-for="(item,index) in menu" :key="index"  :name="index">
                    {{item.name}}
                </MenuItem>
            </Menu>
            </col>
            <col span="6">
            <Input v-model="value1" icon="ios-search" placeholder="Enter something..." style="width: 200px"></Input>
            </col>
        </row>
    </div>


</template>

<script>
    export default {
        name: "topheader",
        data() {
            return {
                menu:[
                    {name:"首页",url:""},
                    {name:"走进园区",url:""},
                    {name:"政务公开",url:""},
                    {name:"招商中心",url:""},
                    {name:"在线服务",url:""},
                    {name:"园区新闻",url:""},
                    {name:"党建中心",url:""},
                ],
                value1: ''
            }
        }
    }
</script>

<style>
    .tophead{
        text-align: left;
        padding:0 100px;
        background: #f2f2f2;
        height: 30px;
        line-height: 30px;
    }
    .headname{
        padding: 16px 30px;
        color: #0b3a59;
        font-weight: bold;
        font-size: 18px;
        text-align: left;
    }
</style>