<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
	<%@ include file="../../static/head.jsp"%>
	<link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css" rel="stylesheet">
	<script type="text/javascript" charset="utf-8">
	    window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
	</script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
  	<style>
		.error{
			color:red;
		}
	</style>
<body>
	<!-- Pre Loader -->
	<div class="loading">
		<div class="spinner">
			<div class="double-bounce1"></div>
			<div class="double-bounce2"></div>
		</div>
	</div>
	<!--/Pre Loader -->
	<div class="wrapper">
		<!-- Page Content -->
		<div id="contentText">
				<!-- Top Navigation -->
				<%@ include file="../../static/topNav.jsp"%>
				<!-- Menu -->
				<div class="container menu-nav">
					<nav class="navbar navbar-expand-lg lochana-bg text-white">
						<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
						 aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
							<span class="ti-menu text-white"></span>
						</button>
				
						<div class="collapse navbar-collapse" id="navbarSupportedContent">
							<!-- <div class="z-navbar-nav-title">$template2.back.menu.title.text</div> -->
							<ul id="navUl" class="navbar-nav mr-auto">
							
							</ul>
						</div>
					</nav>
				</div>
				<!-- /Menu -->
				<!-- Breadcrumb -->
				<!-- Page Title -->
				<div class="container mt-0">
					<div class="row breadcrumb-bar">
						<div class="col-md-6">
							<h3 class="block-title">编辑货物入库</h3>
						</div>
						<div class="col-md-6">
							<ol class="breadcrumb">
								<li class="breadcrumb-item">
									<a href="${pageContext.request.contextPath}/index.jsp">
										<span class="ti-home"></span>
									</a>
								</li>
								<li class="breadcrumb-item"><span>货物入库管理</span></li>
								<li class="breadcrumb-item active"><span>编辑货物入库</span></li>
							</ol>
						</div>
					</div>
				</div>
			<!-- /Page Title -->

			<!-- /Breadcrumb -->
			<!-- Main Content -->
			<div class="container">

				<div class="row">
					<!-- Widget Item -->
					<div class="col-md-12">
						<div class="widget-area-2 lochana-box-shadow">
							<h3 class="widget-title">货物入库信息</h3>
							<form id="addOrUpdateForm">
								<div class="form-row">
									<input id="updateId" name="id" type="hidden">
									<div class="form-group col-md-6">
										<label>货物名称</label>
										<input name="huowumingcheng" id="huowumingcheng" name="huowumingcheng" class="form-control" placeholder="货物名称">
									</div>
									<div class="form-group col-md-6">
										<label>货物类型</label>
										<input name="huowuleixing" id="huowuleixing" name="huowuleixing" class="form-control" placeholder="货物类型">
									</div>
									<div class="form-group col-md-6">
										<label>货物图片</label>
										<div><img id="huowutupianImg" src="" width="100" height="100">
										<div class="upload">选择文件<input name="file" type="file" id="huowutupianupload" class="form-control-file"></div>
										<input name="huowutupian" id="huowutupian-input" type="hidden"></div>
									</div>
									<div class="form-group col-md-6">
										<label>货物规格</label>
										<input name="huowuguige" id="huowuguige" name="huowuguige" class="form-control" placeholder="货物规格">
									</div>
									<div class="form-group col-md-6">
										<label>货物数量</label>
										<input name="huowushuliang" id="huowushuliang" name="huowushuliang" class="form-control" placeholder="货物数量">
									</div>
									<div class="form-group col-md-6">
										<label>仓库编号</label>
										<input name="cangkubianhao" id="cangkubianhao" name="cangkubianhao" class="form-control" placeholder="仓库编号">
									</div>
									<div class="form-group col-md-6">
										<label>仓库名称</label>
										<input name="cangkumingcheng" id="cangkumingcheng" name="cangkumingcheng" class="form-control" placeholder="仓库名称">
									</div>
									<div class="form-group col-md-6">
										<label>仓库位置</label>
										<input name="cangkuweizhi" id="cangkuweizhi" name="cangkuweizhi" class="form-control" placeholder="仓库位置">
									</div>
									<div class="form-group col-md-6">
										<label>厂商编号</label>
										<select  class="form-control"  name="changshangbianhao" id="changshangbianhaoSelect" onchange="changshangbianhaoSelect2Change()">
										</select>
									</div>
									<div class="form-group col-md-6">
										<label>厂商名称</label>
										<input id="changshangmingcheng" name="changshangmingcheng" class="form-control"  value="" readonly>
									</div>
									<div class="form-group col-md-6">
										<label>负责人</label>
										<input id="fuzeren" name="fuzeren" class="form-control"  value="" readonly>
									</div>
									<div class="form-group col-md-6">
										<label>厂商地址</label>
										<input id="changshangdizhi" name="changshangdizhi" class="form-control"  value="" readonly>
									</div>
									<div class="form-group col-md-6">
										<label>联系方式</label>
										<input id="lianxifangshi" name="lianxifangshi" class="form-control"  value="" readonly>
									</div>
									<div class="form-group col-md-6">
										<label>入库时间</label>
										<div id="rukushijianDate" class="input-append date form_datetime">
											<input id="rukushijian-input" name="rukushijian" size="20" type="text" readonly>
											<span class="add-on"><i class="icon-remove"></i></span>
											<span class="add-on"><i class="icon-calendar"></i></span>
										</div>
									</div>
									<div class="form-group col-md-6">
										<label>员工工号</label>
										<input name="yuangonggonghao" id="yuangonggonghao" name="yuangonggonghao" class="form-control" placeholder="员工工号">
									</div>
									<div class="form-group col-md-6">
										<label>员工姓名</label>
										<input name="yuangongxingming" id="yuangongxingming" name="yuangongxingming" class="form-control" placeholder="员工姓名">
									</div>
									<div class="form-group col-md-6">
										<label>入库备注</label>
										<input name="rukubeizhu" id="rukubeizhu" name="rukubeizhu" class="form-control" placeholder="入库备注">
									</div>
										
											<div class="form-group  col-md-12" >
												<label>货物详情</label>
												<div><div class="upload"><input id="huowuxiangqingupload" name="file" type="file">选择文件</div>
												<script id="huowuxiangqingEditor" type="text/plain"></script>
												<script type="text/javascript">
												    //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
												   //相见文档配置属于你自己的编译器
												 var huowuxiangqingUe = UE.getEditor('huowuxiangqingEditor', {
													toolbars: [
														[
															'undo', //撤销
															'bold', //加粗
															'redo', //重做
															'underline', //下划线
															'horizontal', //分隔线
															'inserttitle', //插入标题
															'cleardoc', //清空文档
															'fontfamily', //字体
															'fontsize', //字号
															'paragraph', //段落格式
															'inserttable', //插入表格
															'justifyleft', //居左对齐
															'justifyright', //居右对齐
															'justifycenter', //居中对
															'justifyjustify', //两端对齐
															'forecolor', //字体颜色
															'fullscreen', //全屏
															'edittip ', //编辑提示
															'customstyle', //自定义标题
															 ]
														]
													});
												</script>
												<input type="hidden" name="huowuxiangqing" id="huowuxiangqing-input">
												</div>
											</div>	
									<div class="form-group-1 col-md-6 mb-3" style="display: flex;flex-wrap: wrap;">
										<button  id="submitBtn" type="button" class="btn btn-primary btn-lg">提交</button>
										<button id="exitBtn" type="button" class="btn btn-primary btn-lg">取消</button>
									</div>
								</div>
							</form>
						</div>
					</div>
					<!-- /Widget Item -->
				</div>
			</div>
			<!-- /Main Content -->
		</div>
		<!-- /Page Content -->
	</div>
	<!-- Back to Top -->
	<a id="back-to-top" href="#" class="back-to-top">
		<span class="ti-angle-up"></span>
	</a>
	<!-- /Back to Top -->
	<%@ include file="../../static/foot.jsp"%>
	<script src="${pageContext.request.contextPath}/resources/js/vue.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.ui.widget.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.fileupload.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.form.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/jquery.validate.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/messages_zh.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/validate/card.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/js/datetimepicker/bootstrap-datetimepicker.min.js"></script>
	<script>
		<%@ include file="../../utils/menu.jsp"%>
		<%@ include file="../../static/setMenu.js"%>
		<%@ include file="../../static/utils.js"%>
		<%@ include file="../../utils/baseUrl.jsp"%>   	

		var tableName = "huowuruku";
		var pageType = "add-or-update";
		var updateId = "";
		var crossTableId = -1;
		var crossTableName = '';
		var ruleForm = {};
		var crossRuleForm = {};


		function changshangbianhaoSelect2(){
			http("option/changshangxinxi/changshangbianhao","GET",{
				tableName: "changshangxinxi",
				columnName: "changshangbianhao"
			},(res)=>{
				if(res.code == 0){
					var options = res.data;
					var option = document.createElement("option");
					$("#changshangbianhaoSelect").append(option)
					for(var i=0;i<options.length;i++){
						var changshangbianhaoOption = document.createElement("option");
						changshangbianhaoOption.setAttribute("value",options[i]);
						changshangbianhaoOption.setAttribute("class","changshangbianhaoOption");
						if(ruleForm.changshangbianhao == options[i]){
							changshangbianhaoOption.setAttribute("selected","selected");
						}
						changshangbianhaoOption.innerHTML = options[i];
						//修改 回显
						if(ruleForm.changshangbianhao != null && ruleForm.changshangbianhao != '' && options[i] == ruleForm.changshangbianhao){
							changshangbianhaoOption.setAttribute("selected","selected");
						}
						$("#changshangbianhaoSelect").append(changshangbianhaoOption);
					}
				}
			});
		}		
		function changshangbianhaoSelect2Change(){
			var options = document.getElementById("changshangbianhaoSelect").options;
			var index = document.getElementById("changshangbianhaoSelect").selectedIndex;
			var colVal = options[index].value;
			http("follow/changshangxinxi/changshangbianhao","GET",{
				tableName: "changshangxinxi",
				columnName: "changshangbianhao",
				columnValue: colVal
			},(res)=>{
				if(res.code == 0){
					if(res.data != null && res.data.changshangmingcheng != null){
						$("#changshangmingcheng").val(res.data.changshangmingcheng);
					}
					if(res.data != null && res.data.fuzeren != null){
						$("#fuzeren").val(res.data.fuzeren);
					}
					if(res.data != null && res.data.changshangdizhi != null){
						$("#changshangdizhi").val(res.data.changshangdizhi);
					}
					if(res.data != null && res.data.lianxifangshi != null){
						$("#lianxifangshi").val(res.data.lianxifangshi);
					}
				}
			});
			
		}			

		var ruleForm = {};
		var vm = new Vue({
		  el: '#addOrUpdateForm',
		  data:{
			  ruleForm : {},
			},
		  beforeCreate: function(){
			  var id = window.sessionStorage.getItem("id");
				if(id != null && id != "" && id != "null"){
					$.ajax({ 
		                type: "GET",
		                url: baseUrl + "huowuruku/info/" + id,
		                beforeSend: function(xhr) {xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));},
		                success: function(res){               	
		                	if(res.code == 0){
		                		vm.ruleForm = res.data;
				    		}else if(res.code == 401) {
				    			<%@ include file="../../static/toLogin.jsp"%>    
				    		}else{ alert(res.msg)}
		                },
		            });
				}
			},
			methods: { }
	  	});		

		// 文件上传
		function upload(){
			$('#huowutupianupload').fileupload({
				url: baseUrl + 'file/upload',
				headers:{ token: window.sessionStorage.getItem("token")},
				dataType: 'json',
				done: function (e, data) {				
					document.getElementById('huowutupian-input').setAttribute('value',"upload/"+data.result.file);
					if(document.getElementById('huowutupianFileName') != null){
						document.getElementById('huowutupianFileName').innerHTML = "上传成功!";
					}				
					$("#huowutupianImg").attr("src",baseUrl+"upload/"+data.result.file);								
				}
			});
			$('#huowuxiangqingupload').fileupload({
				url: baseUrl + 'file/upload',
				headers:{ token: window.sessionStorage.getItem("token")},
				dataType: 'json',
				done: function (e, data) {	
					UE.getEditor('huowuxiangqingEditor').execCommand('insertHtml','<img src=\"'+ baseUrl +'upload/'+ data.result.file + '\" width=900 height=560>');					
				}
			});
		}  
		//取消 
		function cancel() {
            window.location.href = "list.jsp";
		}
		function getQueryString(name) { 
			var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i"); 
			var r = window.location.search.substr(1).match(reg); 
			if (r != null) return unescape(r[2]); 
			return null; 
		}

		// 表单提交
		function submit() {

			var crossFlag = getQueryString("cross");
			if(validform() ==true && compare() == true){
				if(crossFlag) {
				}
				let data = {};
				getContent();
				let value = $('#addOrUpdateForm').serializeArray();
				$.each(value, function (index, item) { 
							data[item.name] = item.value;
						});
				let json = JSON.stringify(data);
				var urlParam;
				var successMes = '';
				if(updateId!=null && updateId!="null" && updateId!=''){
					urlParam = 'update';
					successMes = '修改成功';
				}else{		
					urlParam = 'save';
					successMes = '添加成功';
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(crossFlag) {
					//如果跨表更新失败，不显示成功提示
					flag = crossTableUpdate();
										var statusColumnName = window.sessionStorage.getItem('statusColumnName'); 
					var statusColumnValue = window.sessionStorage.getItem('statusColumnValue'); 
					var obj = JSON.parse(window.sessionStorage.getItem('crossObj'));
					if(statusColumnName!='') {
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}
							}
							var table = window.sessionStorage.getItem('crossTableName');
							httpJson(crossTableName + "/update","POST",obj,(res)=>{
								if(res.code == 0){
									console.log('更新属性成功');
								}
							});   
						} else  {
							crossuserid = Number(window.sessionStorage.getItem('userid'));
							crossrefid = obj["id"];
							crossoptnum = window.sessionStorage.getItem('statusColumnName');
							crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					data.crossuserid=crossuserid;
					data.crossrefid=crossrefid;
					http("huowuruku/page","GET",{
						page:1,
						limit:10,
						crossuserid:data.crossuserid,
						crossrefid:data.crossrefid,			
					},(res)=>{
						if(res.data.total >= crossoptnum){
							alert(window.sessionStorage.getItem('tips'));
							return false;
						} else {
							httpJson("huowuruku/"+urlParam,"POST",data,(res)=>{
								if(res.code == 0){
									window.sessionStorage.removeItem('id');
									let flag = true;
									if(crossFlag) {
									}

									if(flag){
										alert(successMes);
									}
									if(window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true"){
										window.sessionStorage.removeItem('onlyme');
										window.location.href="${pageContext.request.contextPath}/index.jsp";
									}else{
                                        window.location.href = "list.jsp";
									}
									
								}
							});
						}
					});
				} else {
					httpJson("huowuruku/"+urlParam,"POST",data,(res)=>{
						if(res.code == 0){
							window.sessionStorage.removeItem('id');
							let flag = true;
							if(crossFlag) {
							}

							if(flag){
								alert(successMes);
							}
							if(window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == "true"){
								window.sessionStorage.removeItem('onlyme');
								window.location.href="${pageContext.request.contextPath}/index.jsp";
							}else{
                                        window.location.href = "list.jsp";
							}
							
						}
					});
				}
			}else{
				alert("表单未填完整或有错误");
			}
		}

		// 填充富文本框
		function setContent(){
			if(ruleForm.huowuxiangqing != null && ruleForm.huowuxiangqing != 'null' && ruleForm.huowuxiangqing != ''){
				var huowuxiangqingMes = '' + ruleForm.huowuxiangqing;
				var huowuxiangqingUeditor = UE.getEditor('huowuxiangqingEditor');
				huowuxiangqingUeditor.ready(function() {
					huowuxiangqingUeditor.setContent(huowuxiangqingMes);
				});
			}
		}  

		// 获取富文本框内容
		function getContent(){
			if(UE.getEditor('huowuxiangqingEditor').hasContents()){
				$('#huowuxiangqing-input').attr('value',UE.getEditor('huowuxiangqingEditor').getContent());
			}
		}

		// 表单校验
		function validform() {
			return $("#addOrUpdateForm").validate({ 
				rules: {
				    huowumingcheng: {
					required: true,
					},
				    huowuleixing: {
					required: true,
					},
				    huowutupian: {
					},
				    huowuguige: {
					},
				    huowushuliang: {
					required: true,
					digits: true,
					},
				    huowuxiangqing: {
					},
				    cangkubianhao: {
					required: true,
					},
				    cangkumingcheng: {
					},
				    cangkuweizhi: {
					},
				    changshangbianhao: {
					required: true,
					},
				    changshangmingcheng: {
					},
				    fuzeren: {
					},
				    changshangdizhi: {
					},
				    lianxifangshi: {
					isPhone: true,
					},
				    rukushijian: {
					required: true,
					},
				    yuangonggonghao: {
					},
				    yuangongxingming: {
					},
				    rukubeizhu: {
					},
				},
				messages: {
					huowuleixing: {
						required: "货物类型不能为空",
					},
					huowutupian: {
					},
					huowuguige: {
					},
					huowushuliang: {
						required: "货物数量不能为空",
					},
					huowuxiangqing: {
					},
					cangkubianhao: {
						required: "仓库编号不能为空",
					},
					cangkumingcheng: {
					},
					cangkuweizhi: {
					},
					changshangbianhao: {
						required: "厂商编号不能为空",
					},
					changshangmingcheng: {
					},
					fuzeren: {
					},
					changshangdizhi: {
					},
					lianxifangshi: {
					},
					rukushijian: {
						required: "入库时间不能为空",
					},
					yuangonggonghao: {
					},
					yuangongxingming: {
					},
					rukubeizhu: {
					},
				}
			}).form();
		}
		// 添加表单校验方法
		function addValidation(){
			jQuery.validator.addMethod("isPhone", function(value, element) {
					var length = value.length;
					var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(19[0-9]{1})|(17[0-9]{1}))+\d{8})$/;
					return this.optional(element) || (length == 11 && mobile.test(value));
			}, "请填写正确的手机号码");
                        jQuery.validator.addMethod("isIdCardNo", function(value, element) {
                                return this.optional(element) || value.length == 18;
                        }, "请正确输入您的身份证号码");
                        jQuery.validator.addMethod("isTel", function(value, element) {
                          var length = value.length;
                          var phone = /(^(\d{3,4}-)?\d{6,8}$)|(^(\d{3,4}-)?\d{6,8}(-\d{1,5})?$)|(\d{11})/;
                          return this.optional(element) || (phone.test(value));
                         }, "请填写正确的固定电话");//可以自定义默认提示信息
		}
		// 获取当前详情
		function getDetails() {
			var id = window.sessionStorage.getItem("id");
			if(id != null && id != "" && id != "null"){
				updateId = id;
				window.sessionStorage.removeItem('id');
				http("huowuruku/info/" + id,"GET",{},(res)=>{
					if(res.code == 0){
						ruleForm = res.data
						// 是/否下拉框回显
						setSelectOption();
						// 设置图片src
						showImg();
						// 数据填充
						dataBind();
						// 富文本框回显	
						setContent();
												changshangbianhaoSelect2();
						//注册表单验证
						$(validform());	
					}
				});
			}else{
				changshangbianhaoSelect2();	



		 		fill()
				//注册表单验证
		    		$(validform());
			}
		}	
		// 下拉框选项回显
		function setSelectOption(){
		}			
		// 关联下拉框改变
		function lvSelectChange(level){
			let data = {};
			let value = $('#addOrUpdateForm').serializeArray();
			$.each(value, function (index, item) { 
			            data[item.name] = item.value;
			        });
			
		}		
		// 清除可能会重复渲染的selection
		function clear(className){
			var elements = document.getElementsByClassName(className);
        	for(var i = elements.length - 1; i >= 0; i--) { 
        	  elements[i].parentNode.removeChild(elements[i]); 
        	}
		}		
		function dateTimePick(){
			$.fn.datetimepicker.dates['zh-CN'] = { 
		            days: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"],
		            daysShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六", "周日"],
		            daysMin:  ["日", "一", "二", "三", "四", "五", "六", "日"],
		            months: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            monthsShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            today: "今天",
		            suffix: [],
		            meridiem: ["上午", "下午"]
		    };
			$("#rukushijianDate").datetimepicker({ 
				autoclose: true,
				format:'yyyy-mm-dd hh:ii:00',
				minuteStep:1,
				language:'zh-CN',
			});

		}		
		
		function calculation(){
			//积
			var x = 0;
			//和
			var y = 0;
			var flag = 0;



		}		
		function calculationSE(colName){
			//单列求和接口
			http("huowuruku"+colName,"GET",{
				tableName: "huowuruku",
				columnName: colName
			},(res)=>{
				if(res.code == 0){
					$("#"+colName).attr("value",res.data);
				}
			});
		}	
		function calculationPre(){
			//进入该页面就填充"单列求和"的列
		}			
		
		
			//新增时填充字段
			function fill(){
				var username = window.sessionStorage.getItem('username');
				var accountTableName = window.sessionStorage.getItem('accountTableName');
				http(accountTableName+'/session','GET',{},(res)=>{
					if(res.code == 0){
						var myId = res.data.id;
						if(res.data !=null && res.data.yuangonggonghao != null && res.data.yuangonggonghao != ''){
							$('#yuangonggonghao').val(res.data.yuangonggonghao)
							$("#yuangonggonghao").attr('readonly','readonly');
						}
						if(res.data !=null && res.data.yuangongxingming != null && res.data.yuangongxingming != ''){
							$('#yuangongxingming').val(res.data.yuangongxingming)
							$("#yuangongxingming").attr('readonly','readonly');
						}
						$(validform());
					}
				});
							
			}	
			
		function dataBind(){
			$("#updateId").val(ruleForm.id);	
			$("#huowumingcheng").val(ruleForm.huowumingcheng);	
			$("#huowuleixing").val(ruleForm.huowuleixing);	
			$("#huowutupian-input").val(ruleForm.huowutupian);
			$("#huowuguige").val(ruleForm.huowuguige);	
			$("#huowushuliang").val(ruleForm.huowushuliang);	
			$("#huowuxiangqing").val(ruleForm.huowuxiangqing);	
			$("#cangkubianhao").val(ruleForm.cangkubianhao);	
			$("#cangkumingcheng").val(ruleForm.cangkumingcheng);	
			$("#cangkuweizhi").val(ruleForm.cangkuweizhi);	
				
						$("#changshangmingcheng").val(ruleForm.changshangmingcheng);	
			$("#fuzeren").val(ruleForm.fuzeren);	
			$("#changshangdizhi").val(ruleForm.changshangdizhi);	
			$("#lianxifangshi").val(ruleForm.lianxifangshi);	
			$("#rukushijian-input").val(ruleForm.rukushijian);
			$("#yuangonggonghao").val(ruleForm.yuangonggonghao);	
			$("#yuangongxingming").val(ruleForm.yuangongxingming);	
			$("#rukubeizhu").val(ruleForm.rukubeizhu);	
		}		
		//图片显示
		function showImg(){
			var huowutupianFileName = "\"" + ruleForm.huowutupian + "\"";
			$("#huowutupianImg").attr("src",baseUrl+ruleForm.huowutupian);
		}		
		//跨表

        //跨表
        function crossTable(){
		crossTableName = window.sessionStorage.getItem('crossTableName');
		crossTableId = window.sessionStorage.getItem('crossTableId');
		if(crossTableName != null && crossTableName != '' && crossTableId != null && crossTableId != '' && crossTableId != -1){
			http(crossTableName + "/info/" + crossTableId,"GET",{},(res)=>{
				if(res.code == 0){
					crossRuleForm = res.data;
					$('#updateId').val(crossTableId);
					if(res.data != null && res.data != '' && res.data.huowumingcheng != null && res.data.huowumingcheng != ''){

						$("#huowumingcheng").val(res.data.huowumingcheng);
						$("#huowumingcheng").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.huowuleixing != null && res.data.huowuleixing != ''){

						$("#huowuleixing").val(res.data.huowuleixing);
						$("#huowuleixing").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.huowutupian != null && res.data.huowutupian != ''){

						$("#huowutupianImg").attr("src",baseUrl+res.data.huowutupian);
						$("#huowutupian-input").val(res.data.huowutupian);
					}
					if(res.data != null && res.data != '' && res.data.huowuguige != null && res.data.huowuguige != ''){

						$("#huowuguige").val(res.data.huowuguige);
						$("#huowuguige").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.huowushuliang != null && res.data.huowushuliang != ''){

						$("#huowushuliang").val(res.data.huowushuliang);
					}
					if(res.data != null && res.data != '' && res.data.huowuxiangqing != null && res.data.huowuxiangqing != ''){

						$("#huowuxiangqing").val(res.data.huowuxiangqing);
                        var huowuxiangqingMes = '' + res.data.huowuxiangqing;
                        var huowuxiangqingUeditor = UE.getEditor('huowuxiangqingEditor');
                        huowuxiangqingUeditor.ready(function() {
                            huowuxiangqingUeditor.setContent(huowuxiangqingMes);
                        });
					}
					if(res.data != null && res.data != '' && res.data.cangkubianhao != null && res.data.cangkubianhao != ''){

						$("#cangkubianhao").val(res.data.cangkubianhao);
						$("#cangkubianhao").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.cangkumingcheng != null && res.data.cangkumingcheng != ''){

						$("#cangkumingcheng").val(res.data.cangkumingcheng);
						$("#cangkumingcheng").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.cangkuweizhi != null && res.data.cangkuweizhi != ''){

						$("#cangkuweizhi").val(res.data.cangkuweizhi);
						$("#cangkuweizhi").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.changshangbianhao != null && res.data.changshangbianhao != ''){

					}
					if(res.data != null && res.data != '' && res.data.changshangmingcheng != null && res.data.changshangmingcheng != ''){

						$("#changshangmingcheng").val(res.data.changshangmingcheng);
						$("#changshangmingcheng").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.fuzeren != null && res.data.fuzeren != ''){

						$("#fuzeren").val(res.data.fuzeren);
						$("#fuzeren").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.changshangdizhi != null && res.data.changshangdizhi != ''){

						$("#changshangdizhi").val(res.data.changshangdizhi);
						$("#changshangdizhi").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.lianxifangshi != null && res.data.lianxifangshi != ''){

						$("#lianxifangshi").val(res.data.lianxifangshi);
						$("#lianxifangshi").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.rukushijian != null && res.data.rukushijian != ''){

						$("#rukushijian-input").val(res.data.rukushijian);
						$('#rukushijianFileName').val(res.data.rukushijian)
					}
					if(res.data != null && res.data != '' && res.data.yuangonggonghao != null && res.data.yuangonggonghao != ''){

						$("#yuangonggonghao").val(res.data.yuangonggonghao);
						$("#yuangonggonghao").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.yuangongxingming != null && res.data.yuangongxingming != ''){

						$("#yuangongxingming").val(res.data.yuangongxingming);
						$("#yuangongxingming").attr('readonly','readonly');
					}
					if(res.data != null && res.data != '' && res.data.rukubeizhu != null && res.data.rukubeizhu != ''){

						$("#rukubeizhu").val(res.data.rukubeizhu);
						$("#rukubeizhu").attr('readonly','readonly');
					}
				}
			});  
            }
		window.sessionStorage.removeItem('crossTableName');
		window.sessionStorage.removeItem('crossTableId');
        }
		
		//跨表更新字段
		function crossTableUpdate(){
			let flag = crossTableUpdateValidation();
			if(flag){
				httpJson(crossTableName + "/update","POST",{
					id: crossTableId,
					huowushuliang: Number(crossRuleForm.huowushuliang) + Number($('#huowushuliang').val()),
				},(res)=>{
					if(res.code == 0){
						console.log('跨表更新成功');
						return true;
					}
				});   
			}
			return false;
		}

		//跨表更新前验证
		function crossTableUpdateValidation(){
			//防止减法导致库存负值
			return true;
		}
		$(document).ready(function() { 
			//设置右上角用户名
            $('.dropdown-menu h5').html(window.sessionStorage.getItem('username')+'('+window.sessionStorage.getItem('role')+')')
			//设置项目名
			$('.sidebar-header h3 a').html(projectName)
			//设置导航栏菜单
			setMenu();
			//初始化时间插件
			dateTimePick();
			//添加表单校验信息文本
			addValidation();
			getDetails();
			//初始化上传按钮
			upload();
			//单列求和
			calculationPre();
			//跨表
			crossTable();
			<%@ include file="../../static/myInfo.js"%>
			$('#submitBtn').on('click', function(e) {
			    e.preventDefault();
			    //console.log("点击了...提交按钮");
			    submit();
			});
			$('#exitBtn').on('click', function(e) {
			    cancel();
			});
			readonly();
		});		

		function readonly(){
            if(window.sessionStorage.getItem('role')!="管理员") {
				$('#money').attr('readonly','readonly');
            }
		}

		//比较大小
		function compare(){
			var largerVal = null;
			var smallerVal = null;
			if(largerVal !=null && smallerVal != null){
				if(parseInt(largerVal)<=parseInt(smallerVal)){
					alert(smallerName+'不能大于等于'+largerName);
					return false;
				}
			}
			return true;
		}


		// 用户登出
        <%@ include file="../../static/logout.jsp"%>		
	</script>
</body>

</html>
