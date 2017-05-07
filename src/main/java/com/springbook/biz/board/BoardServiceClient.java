package com.springbook.biz.board;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Created by Jun Ho Park on 2017-05-03.
 */
public class BoardServiceClient {
    public static void main(String[] args) {
        // spring container 구동
        AbstractApplicationContext container =
                new GenericXmlApplicationContext("applicationContext.xml");

        // spring 컨테이너로 부터 boardserviceimpl을 look up
        BoardService boardService = (BoardService) container.getBean("boardService");

        BoardVO vo = new BoardVO();
        vo.setTitle("임시 제목");
        vo.setWriter("고길동");
        vo.setContent("temp contents~");
        boardService.insertBoard(vo);

        List<BoardVO> boardList = boardService.getBoardList(vo);

        for(BoardVO board : boardList) {
            System.out.println("---> " + board.toString());
        }

        container.close();
    }
}
