package com.psyworld.comm.board.service.model;

import java.util.Date;

/**
 * 보드 관리
 * @author psy_world
 *
 */
public class BoardMng {

	//보드 명
	private String boardNm = "";
	//보드 ID
	private String boardId = "";
	
	//보드 구분
	private String boardGbn = "";
	//보드 상태
	private String boardStatus = "";
	
	//댓글 가능 여부
	private String commentYn = "Y";
	//사용 여부
	private String useYn = "Y";
	//노출 여부
	private String showYn = "Y";
	
	//등록 일자
	private Date regDate = new Date();
	//등록자
	private String regrId = "";	
	//수정 일자
	private Date modDate = new Date();
	//수정자
	private String modrId = "";
	public String getBoardNm() {
		return boardNm;
	}
	public void setBoardNm(String boardNm) {
		this.boardNm = boardNm;
	}
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	public String getBoardGbn() {
		return boardGbn;
	}
	public void setBoardGbn(String boardGbn) {
		this.boardGbn = boardGbn;
	}
	public String getBoardStatus() {
		return boardStatus;
	}
	public void setBoardStatus(String boardStatus) {
		this.boardStatus = boardStatus;
	}
	public String getCommentYn() {
		return commentYn;
	}
	public void setCommentYn(String commentYn) {
		this.commentYn = commentYn;
	}
	public String getUseYn() {
		return useYn;
	}
	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	public String getShowYn() {
		return showYn;
	}
	public void setShowYn(String showYn) {
		this.showYn = showYn;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getRegrId() {
		return regrId;
	}
	public void setRegrId(String regrId) {
		this.regrId = regrId;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	public String getModrId() {
		return modrId;
	}
	public void setModrId(String modrId) {
		this.modrId = modrId;
	}
	@Override
	public String toString() {
		return "BoardMng [boardNm=" + boardNm + ", boardId=" + boardId + ", boardGbn=" + boardGbn + ", boardStatus="
				+ boardStatus + ", commentYn=" + commentYn + ", useYn=" + useYn + ", showYn=" + showYn + ", regDate="
				+ regDate + ", regrId=" + regrId + ", modDate=" + modDate + ", modrId=" + modrId + "]";
	}
	
}
