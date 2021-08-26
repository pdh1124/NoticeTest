package com.spring.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.board.dao.BoardDao;
import com.spring.board.service.boardService;
import com.spring.board.vo.BoardVo;
import com.spring.board.vo.PageVo;

@Service
public class boardServiceImpl implements boardService{
	
	@Autowired
	BoardDao boardDao;
	
	@Override
	public String selectTest() throws Exception {
		// TODO Auto-generated method stub
		return boardDao.selectTest();
	}
	
	@Override
	public List<BoardVo> SelectBoardList(PageVo pageVo) throws Exception {
		// TODO Auto-generated method stub	
		return boardDao.selectBoardList(pageVo);
	}
	
	@Override
	public int selectBoardCnt() throws Exception {
		// TODO Auto-generated method stub
		return boardDao.selectBoardCnt();
	}
	
	@Override
	public BoardVo selectBoard(String boardType, int boardNum) throws Exception {
		// TODO Auto-generated method stub
		BoardVo boardVo = new BoardVo();
		
		boardVo.setBoardType(boardType);
		boardVo.setBoardNum(boardNum);
		
		return boardDao.selectBoard(boardVo);
	}
	
	@Override
	public int boardInsert(BoardVo boardVo) throws Exception {
		// TODO Auto-generated method stub
		
		//리스트 카운트
		int[] successCnt = new int[boardVo.getListBoard().size()];
		
		//횟수
		int result = 1;
			for(int i=0; i<boardVo.getListBoard().size();i++) { //배열 수 만큼
				
					successCnt[i] = boardDao.boardInsert(boardVo.getListBoard().get(i)); //n번째 데이터로 insert
					result *= successCnt[i]; // 1* 배열 수
		}
		
		return result; //총 배열 수
		//return boardDao.boardInsert(boardVo);
	}

//	@Override
//	public int boardInsertIfNull(BoardVo boardVo) throws Exception {
//		// TODO Auto-generated method stub
//		return boardDao.boardInsertIfNull(boardVo);
//	}
	
	@Override
	public int boardModify(BoardVo boardVo) throws Exception {
		// TODO Auto-generated method stub
		return boardDao.boardModify(boardVo);
	}

	@Override
	public int boardDelete(BoardVo boardVo) throws Exception {
		// TODO Auto-generated method stub
		return boardDao.boardDelete(boardVo);
	}

	
}
