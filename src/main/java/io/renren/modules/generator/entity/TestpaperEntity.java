package io.renren.modules.generator.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 试题管理
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-11-21 17:24:14
 */
@TableName("tb_testpaper")
public class TestpaperEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long paperId;
	/**
	 * 考卷名称
	 */
	private String paperName;
	/**
	 * 考卷序号 例如 8 就是 第八题
	 */
	private Integer subjectNo;
	/**
	 * 考卷描述
	 */
	private String subjectDesc;
	/**
	 * 考题url
	 */
	private String subjectPic;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 更改时间
	 */
	private Date tsrefreshtime;

	/**
	 * 设置：
	 */
	public void setPaperId(Long paperId) {
		this.paperId = paperId;
	}
	/**
	 * 获取：
	 */
	public Long getPaperId() {
		return paperId;
	}
	/**
	 * 设置：考卷名称
	 */
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}
	/**
	 * 获取：考卷名称
	 */
	public String getPaperName() {
		return paperName;
	}
	/**
	 * 设置：考卷序号 例如 8 就是 第八题
	 */
	public void setSubjectNo(Integer subjectNo) {
		this.subjectNo = subjectNo;
	}
	/**
	 * 获取：考卷序号 例如 8 就是 第八题
	 */
	public Integer getSubjectNo() {
		return subjectNo;
	}
	/**
	 * 设置：考卷描述
	 */
	public void setSubjectDesc(String subjectDesc) {
		this.subjectDesc = subjectDesc;
	}
	/**
	 * 获取：考卷描述
	 */
	public String getSubjectDesc() {
		return subjectDesc;
	}
	/**
	 * 设置：考题url
	 */
	public void setSubjectPic(String subjectPic) {
		this.subjectPic = subjectPic;
	}
	/**
	 * 获取：考题url
	 */
	public String getSubjectPic() {
		return subjectPic;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateDate() {
		return createDate;
	}
	/**
	 * 设置：更改时间
	 */
	public void setTsrefreshtime(Date tsrefreshtime) {
		this.tsrefreshtime = tsrefreshtime;
	}
	/**
	 * 获取：更改时间
	 */
	public Date getTsrefreshtime() {
		return tsrefreshtime;
	}
}
