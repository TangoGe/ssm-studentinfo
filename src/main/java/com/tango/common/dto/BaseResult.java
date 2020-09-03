/**
 * 
 */
package com.tango.common.dto;

/**
 * @author Tango 自定义返回结果类
 */
public class BaseResult {
	public static final int STATUS_SUCCESS = 200; // 成功
	public static final int STATUS_FAIL = 500;// 失败

	private int status; // 状态
	private String message;// 信息
	private Object data;// 返回数据

	public static BaseResult buildSuccess() {
		return BaseResult.createResult(BaseResult.STATUS_SUCCESS, "成功", null);
	}

	public static BaseResult buildSuccess(Object data) {
		return BaseResult.createResult(BaseResult.STATUS_SUCCESS, "成功", data);
	}

	public static BaseResult buildSuccess(String message, Object data) {
		return BaseResult.createResult(BaseResult.STATUS_SUCCESS, message, data);
	}

	public static BaseResult buildFail() {
		return BaseResult.createResult(BaseResult.STATUS_FAIL, "失败", null);
	}

	public static BaseResult buildFail(Object data) {
		return BaseResult.createResult(BaseResult.STATUS_FAIL, "失败", data);
	}

	public static BaseResult buildFail(String message, Object data) {
		return BaseResult.createResult(BaseResult.STATUS_FAIL, message, data);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	private static BaseResult createResult(int status, String message, Object data) {
		BaseResult baseResult = new BaseResult();
		baseResult.setStatus(status);
		baseResult.setMessage(message);
		baseResult.setData(data);

		return baseResult;
	}
}
