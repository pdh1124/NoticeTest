package com.spring.board.vo;

import java.util.List;

public class BoardVo {
	
	private String 	boardType;
	private int 	boardNum;
	private String 	boardTitle;
	private String 	boardComment;
	private String 	creator;
	private String	modifier;
	private int totalCnt;
	
	private String[] boardTitleList;
	private String[] boardCommentList;
	
	private List<BoardVo> ListBoard;
	
	
	public int getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardType() {
		return boardType;
	}
	public void setBoardType(String boardType) {
		this.boardType = boardType;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardComment() {
		return boardComment;
	}
	public void setBoardComment(String boardComment) {
		this.boardComment = boardComment;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public String[] getBoardTitleList() {
		return boardTitleList;
	}

	public void setBoardTitleList(String[] boardTitleList) {
		this.boardTitleList = boardTitleList;
	}

	public String[] getBoardCommentList() {
		return boardCommentList;
	}

	public void setBoardCommentList(String[] boardCommentList) {
		this.boardCommentList = boardCommentList;
	}
	public List<BoardVo> getListBoard() {
		return ListBoard;
	}
	public void setListBoard(List<BoardVo> listBoard) {
		ListBoard = listBoard;
	}
	

	
	
}
