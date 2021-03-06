package com.streamlet.base;

import com.streamlet.common.util.FileUtils;

public class Constant {


	/**
	 * 图片目录
	 */
	public static final String FILE_PATH = FileUtils.getSavePath();
	public static final String TEMPORARY_FILE_PATH = FileUtils.getTemporarySavePath();

	/** 照相请求码 */
	public static final int CAMERA_REQUESTCODE = 100;
	/** 照片图片编辑请求码 */
	public static final int CAMERA_ET_REQUESTCODE = 101;
	/** 选择联系人请求码 */
	public static final int CONTACTS_ET_REQUESTCODE = 102;
	/** 相册请求的编码 */
	public static final int PHOTO_REQUESTCODE = 200;
	/** 发布编辑请求码 */
	public static final int PHBLISH_ET_REQUESTCODE = 301;


	/**轮播测试数据*/
	public static final String[] IMAGES = new String[] {
		"http://b.hiphotos.baidu.com/image/pic/item/023b5bb5c9ea15cec72cb6d6b2003af33b87b22b.jpg",
		"http://b.hiphotos.baidu.com/image/pic/item/023b5bb5c9ea15cec72cb6d6b2003af33b87b22b.jpg",
		"http://f.hiphotos.baidu.com/image/pic/item/b2de9c82d158ccbf79a00f8c1cd8bc3eb1354163.jpg",
		"http://f.hiphotos.baidu.com/image/pic/item/b2de9c82d158ccbf79a00f8c1cd8bc3eb1354163.jpg",
		"http://b.hiphotos.baidu.com/image/pic/item/023b5bb5c9ea15cec72cb6d6b2003af33b87b22b.jpg",
		"http://e.hiphotos.baidu.com/image/pic/item/14ce36d3d539b600be63e95eed50352ac75cb7ae.jpg",
		"http://e.hiphotos.baidu.com/image/pic/item/14ce36d3d539b600be63e95eed50352ac75cb7ae.jpg",
		"http://weloveicons.s3.amazonaws.com/icons/100929_applications.png",
		"http://112.74.18.34:12002/2016/01/14/8c8312316c3398147d62a49c6c294bca_yckx_temp.png",
		"http://f.hiphotos.baidu.com/image/pic/item/b2de9c82d158ccbf79a00f8c1cd8bc3eb1354163.jpg",
		"http://e.hiphotos.baidu.com/image/pic/item/14ce36d3d539b600be63e95eed50352ac75cb7ae.jpg",
		"http://3.bp.blogspot.com/-ka5MiRGJ_S4/TdD9OoF6bmI/AAAAAAAAE8k/7ydKtptUtSg/s1600/Google_Sky%2BMaps_Android.png",
		"http://112.74.18.34:12002/2016/01/14/8c8312316c3398147d62a49c6c294bca_yckx_temp.png",
		"http://112.74.18.34:12002/2016/01/14/8c8312316c3398147d62a49c6c294bca_yckx_temp.png", 
		"", 
		"http://wrong.site.com/corruptedLink", 
	};
	
	
	public static final String REGIST="http://test.youchekuaixi.com/auth/phone-captcha?phone=11";



}
