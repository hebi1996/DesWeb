<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html style="height: auto;"><head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<title>JZ - 极宅 外卖网</title>

		<link rel="stylesheet" href="static/css/default/bootstrap/bootstrap.css">
		<link rel="stylesheet" href="static/comp/fontawesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="static/comp/ionicons/css/ionicons.min.css">
		<link rel="stylesheet" href="static/comp/adminlte/css/adminlte.css">
		<link rel="stylesheet" href="static/css/default/mask.css">
		
		<link rel="stylesheet" href="static/comp/cropper/css/cropper.min.css">
    	<link rel="stylesheet" href="static/comp/cropper/css/ImgCropping.css">
	</head>

	<body style="height: auto;">
		
		
		<!--  <div class="container-fluid" id="ORG_LIST_DIV_ID">-->
		<div class="container-fluid" id="USERS_LIST_DIV_ID" style="display:block;">
			<div class="row">
				<div class="col-md-12" style="">
					<div class="card card-info">
						<div class="card-header">
							<h3 class="card-title">查询条件</h3>
						</div>
						<div class="card-body">
							<div class="row">
								<div class="col-md-11">
									<div class="form-inline">
										<div class="form-group col-md-4">
											<label for="SEARCH_ORG_NAME" class="col-md-4">用户名：</label>
											<div class="col-md-8">
												<input type="hidden" id="SEARCH_USER_NAMW_HIDDEN" name="SEARCH_USER_NAMW_HIDDEN" value="">
												<input type="text" id="SEARCH_USER_NAMW" name="SEARCH_USER_NAMW" size="20" value="" class="form-control" placeholder="请输入用户名">
											</div>
										</div>
										
									
									</div>
								</div>
								<div class="col-md-1">
									<button class="btn btn-block btn-info" onclick="searchByUserName()">查询</button>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="col-12">
					<div class="card">
						<div class="card-header" style="width:100%">
							<h3 class="card-title col-md-3">当前：<span id="LABLE_FATHER_ORG_NAME">用户管理-普通用户</span></h3>
							<div class="col-md-2 col-md-offset-7" id="userAddDiv"><button class="btn  btn-success btn-sm" type="button" onclick="ADD_USER()">新增</button>&nbsp;&nbsp;</div>
						</div>
						<div class="card-body">
							<div id="example2_wrapper" class="dataTables_wrapper container-fluid dt-bootstrap4">
								<div class="row">
									<div class="col-sm-12 col-md-6"></div>
									<div class="col-sm-12 col-md-6"></div>
								</div>
								
								<div class="row">
									<div class="col-sm-12">
										<table id="example2" class="table table-bordered table-hover dataTable" role="grid">
											<thead>
												<tr role="row">
	
													<th style="text-align:center;" class="sorting" rowspan="1" colspan="1">用户名</th>
													<th style="text-align:center;" class="sorting" rowspan="1" colspan="1">真实姓名</th>
													<th style="text-align:center;" class="sorting" rowspan="1" colspan="1">电子邮箱</th>
													<th style="text-align:center;" class="sorting" rowspan="1" colspan="1">手机号码</th>
													<th style="text-align:center;" class="sorting" rowspan="1" colspan="1">送货地址</th>
													<th style="text-align:center;" class="sorting" rowspan="1" colspan="1">操作</th>
			
												</tr>
											</thead>
											<tbody id="POST_LIST_TBODY_ID">
												<c:forEach items="${page.list }" var="u">
													<tr bgcolor="#FFFFFF">
														<td valign="center" align="center" width="30">${u.loginName }</td>
														<td valign="center" align="center" width="30">${u.trueName }</td>
														<td valign="center" align="center" width="30">${u.email }</td>
														<td valign="center" align="center" width="30">${u.phone }</td>
														<td valign="center" align="center" width="30">${u.address }</td>
														<td valign="center" align="center" width="30">
															<a href="javascript:" onclick="users_edit(${u.id },'${u.loginName }','${u.loginPwd }','${u.trueName }','${u.email }','${u.phone }','${u.address }')">编辑</a>
															&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
															<a href="javascript:" onclick="users_delete(${u.id })">删除</a>
														</td>
													</tr>
												</c:forEach>
											</tbody>
											<tfoot></tfoot>
										</table>
									</div>
								</div>
								
								<div class="row">
									<div class="col-sm-12 col-md-9 col-md-offset-3">
										<div class="dataTables_paginate paging_simple_numbers">
											<ul class="pagination" id="PAGE_ID">
												<c:if test="${page.prev }">
													<li><a href="usersManage?page=1">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
													<li><a href="usersManage?page=${page.now_page-1 }">上一页</a></li>
												</c:if>
												<c:if test="${page.next }">
													<li><a href="usersManage?page=${page.now_page+1 }">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
													<li><a href="usersManage?page=${page.page_total }">尾页</a></li>
												</c:if>
												
												<li style="margin-left: 30px">
													<input id="JUMP_INPUT_ID" type="text" style="display:inline;width:80px" size="6">
													<button id="goto_page" class="btn btn-sm btn-outline-primary"><a href="javascript:">跳转</a></button>
												</li>
												
												<li style="margin-left: 30px">
													<div class="dataTables_info" style="margin-top: 6px;margin-left: 100px">
														<span>${page.now_page }/${page.page_total } 页</span>
														<span>共12条</span>
													</div>
												</li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!-- /.card-body -->
					</div>

				</div>

			</div>

		</div>
		
		<div id="USER_ADD_DIV_ID" class="card card-info" style="display:none;">
	    	<div class="card-header">
	             <h3 class="card-title">用户添加</h3>
	        </div> 
	        <div class="form-horizontal">
	        							
	             <div class="card-body">
			             <div class="form-group">
			                 <label for="JI_JOB_NAME" class="col-sm-2 control-label">用户名：</label>
			              	 <div class="col-sm-10">
			                 	<input value="" type="text" name="addLoginName" id="addLoginName" class="form-control" style="width:900px" maxlength="20">
			                 </div>
			             </div>
			             <div class="form-group">
			                 <label for="JI_JOB_NAME" class="col-sm-2 control-label">密码：</label>
			                 <div class="col-sm-10">
			                 	<input value="" type="password" name="addLoginPwd" id="addLoginPwd" class="form-control" style="width:900px" maxlength="6">
			                 </div>
			             </div>
			             <div class="form-group">
			                 <label for="JI_JOB_NAME" class="col-sm-2 control-label">真实姓名：</label>
			                 <div class="col-sm-10">
			                 	<input value="" type="text" name="addTrueName" id="addTrueName" class="form-control" style="width:900px" maxlength="20">
			                 </div>
			             </div>
			             <div class="form-group">
			                 <label for="JI_JOB_NAME" class="col-sm-2 control-label">电子邮箱：</label>
			                 <div class="col-sm-10">
			                 	<input value="" type="text" name="addEmail" id="addEmail" class="form-control" style="width:900px" maxlength="20">
			                 </div>
			              </div>
			              <div class="form-group">
			                 <label for="JI_JOB_NAME" class="col-sm-2 control-label">手机号码：</label>
			                 <div class="col-sm-10">
			                 	<input value="" type="text" name="addPhone" id="addPhone" class="form-control" style="width:900px" maxlength="20">
			                 </div>
			              </div>
			              <div class="form-group">
			                 <label for="JI_JOB_NAME" class="col-sm-2 control-label">送货地址：</label>
			                 <div class="col-sm-10">
			                 	<input value="" type="text" name="addAddress" id="addAddress" class="form-control" style="width:900px" min="50">
			                 </div>
			       		  </div>
			           
			             <!-- /.card-body -->
			             <div class="card-footer col-md-3 col-md-offset-4" style="width:100%" align="center">
			               <button type="button" class="btn btn-info" onclick="addUserCheck()">提交</button>
			               <button type="button" class="btn btn-default" onclick="returnUserList()">返回</button>
			             </div>
			             <!-- /.card-footer -->
			             <div class="card-footer col-md-3 col-md-offset-4" id="tishi" style="text-align: center;color: red;font-size: 15px"></div>
	             </div>
	            
	        </div>
	    </div>
	    
	    <div id="USER_EDIT_DIV_ID" class="card card-info" style="display:none;">
	    	<div class="card-header">
	             <h3 class="card-title">编辑用户</h3>
	        </div> 
	        <div class="form-horizontal">
	        							
	             <div class="card-body">
			             <div class="form-group">
			                 <label for="JI_JOB_NAME" class="col-sm-2 control-label">用户名：</label>
			              	 <div class="col-sm-10">
			              	    <input value="" type="hidden" name="editId" id="editId" class="form-control" style="width:900px" maxlength="20">
			                 	<input value="" type="text" name="editLoginName" id="editLoginName" class="form-control" style="width:900px" maxlength="20" readonly="readonly">
			                 </div>
			             </div>
			             <div class="form-group">
			                 <label for="JI_JOB_NAME" class="col-sm-2 control-label">密码：</label>
			                 <div class="col-sm-10">
			                	 <input value="" type="hidden" name="editLoginPwdHidder" id="editLoginPwdHidder" class="form-control" style="width:900px" maxlength="6">
			                 	<input value="" type="password" name="editLoginPwd" id="editLoginPwd" class="form-control" style="width:900px" maxlength="6">
			                 </div>
			             </div>
			             <div class="form-group">
			                 <label for="JI_JOB_NAME" class="col-sm-2 control-label">真实姓名：</label>
			                 <div class="col-sm-10">
			                 	<input value="" type="text" name="editTrueName" id="editTrueName" class="form-control" style="width:900px" maxlength="20">
			                 </div>
			             </div>
			             <div class="form-group">
			                 <label for="JI_JOB_NAME" class="col-sm-2 control-label">电子邮箱：</label>
			                 <div class="col-sm-10">
			                 	<input  value="" type="text" name="editEmail" id="editEmail" class="form-control" style="width:900px" maxlength="20">
			                 </div>
			              </div>
			              <div class="form-group">
			                 <label for="JI_JOB_NAME" class="col-sm-2 control-label">手机号码：</label>
			                 <div class="col-sm-10">
			                 	<input value="" type="text" name="editPhone" id="editPhone" class="form-control" style="width:900px" maxlength="20">
			                 </div>
			              </div>
			              <div class="form-group">
			                 <label for="JI_JOB_NAME" class="col-sm-2 control-label">送货地址：</label>
			                 <div class="col-sm-10">
			                 	<input value="" type="text" name="editAddress" id="editAddress" class="form-control" style="width:900px" min="50">
			                 </div>
			       		  </div>
			           
			             <!-- /.card-body -->
			             <div class="card-footer col-md-3 col-md-offset-4" style="width:100%" align="center">
			               <button type="button" class="btn btn-info" onclick="edtiUserCheck()">提交</button>
			               <button type="button" class="btn btn-default" onclick="returnUserList()">返回</button>
			             </div>
			             <!-- /.card-footer -->
			             <div class="card-footer col-md-3 col-md-offset-4" id="tishi1" style="text-align: center;color: red;font-size: 15px"></div>
	             </div>
	            
	        </div>
	    </div>
		
		<script src="static/comp/jquery/dist/jquery.js"></script>
		<script src="static/comp/jQuery-Storage-API/jquery.storageapi.js"></script>
		<script src="static/comp/jquery.form/jquery.form.min.js"></script>
		<script src="static/comp/jquery/plugins/scrollbar/perfect-scrollbar.jquery.min.js"></script>
		
		<script src="static/kindeditor/kindeditor-all.js" type="text/javascript"></script> 
		<script src="static/kindeditor/kindeditor-all-min.js" type="text/javascript"></script>
		<script src="static/kindeditor/lang/zh-CN.js" type="text/javascript"></script>
		<script src="static/js/common/mask.js"></script>
		<script src="static/comp/cropper/js/cropper.min.js"></script>
		<script src="chinasofti/usersManage/js/usersManage.js"></script>
		<script type="text/javascript" src="static/js/alert.js"></script>
		
		<!--  
		<script src="/stmadc/stma/dc/include/js/jcommon.js"></script>
		
		<script language="JavaScript" src="/stmadc/jquery/jquery-ui-1.8.20.min.js"></script>
		<script src="/stmadc/static/comp/bootstrap/dist/js/bootstrap.js"></script>
		<script src="/stmadc/static/comp/adminlte/js/adminlte.min.js"></script>
		<script language="JavaScript" src="/stmadc/stma/dc/include/js/jcommon.js"></script>
	-->


</body></html>