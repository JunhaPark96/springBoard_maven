package mybatis;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

public class BoardDAO {
	private SqlSession sqlSession;
	public BoardDAO() {
	}
	public BoardDAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public void work() {
		// db에 sql 호출
		System.out.println("sql 수행전");
//		insertNewPost();
//		selectAllPost();
//		selectByName2();
		selectByName3();
//		deleteByNo();
//		selectByNo2();
//		selectDSQL();
//		selectDSQLif2();
//		selectForEach();
		System.out.println("sql 수행완료");
	}
	
	
	public void insertNewPost() {
		sqlSession.insert("BoardVO.insertNewPost");
//		BoardVO vo = new BoardVO();
//		vo.setTitle("홍길동전");
//		vo.setWriter("홍길동");
//		vo.setContent("내용");
//		sqlSession.insert("mybatis.BoardDAO.insertNewPost2", vo);
		sqlSession.commit();
	}
	public void selectAllPost() {
		List<BoardVO> boardList = sqlSession.selectList("mybatis.BoardDAO.selectAll");
		for (BoardVO vo : boardList) {
			System.out.println(vo.toString());
		}
	}
	public void selectByName() {
		BoardVO vo = new BoardVO();
		vo.setWriter("이정민");
		List<BoardVO> boardList =
		sqlSession.selectList("mybatis.BoardDAO.selectByName", vo);
		
		for (BoardVO vos : boardList) {
			System.out.println(vos.toString());
		}
	}
	public void selectByName2() {
		String name = "이정민";
		List<BoardVO> boardList =
				sqlSession.selectList("mybatis.BoardDAO.selectByName2", name);
		for (BoardVO vos : boardList) {
			System.out.println(vos.toString());
		}
	}
	public void selectByName3() {
		String name = "이정";
		List<BoardVO> boardList =
				sqlSession.selectList("mybatis.BoardDAO.selectByName3", name);
		for (BoardVO vos : boardList) {
			System.out.println(vos.toString());
		}
	}
	public void selectByNo() {
		int num = 10;
		List<BoardVO> boardList =
				sqlSession.selectList("mybatis.BoardDAO.selectByNo", num);
		for (BoardVO vos : boardList) {
			System.out.println(vos.toString());
		}
		
	}
	public void selectByNo2() {
		Map<String, Object> voMap = sqlSession.selectOne("mybatis.BoardDAO.selectByNo2", 10);
		Set<String> keyset = voMap.keySet();
		for (String key : keyset) {
			System.out.println(key + " " + voMap.get(key));
		}
	}
	
	public void updateByName() {
		BoardVO vo = new BoardVO();
		vo.setWriter("박태현");
		vo.setNo(10);
		sqlSession.update("mybatis.BoardDAO.updateByNo", vo);
		sqlSession.commit();
	}
	public void deleteByNo() {
		BoardVO vo = new BoardVO();
		vo.setNo(4);
		sqlSession.delete("mybatis.BoardDAO.deleteByNo", vo);
		sqlSession.commit();
	}
	
	public void selectDSQL() {
		BoardVO inputVO = new BoardVO();
		inputVO.setTitle("제일싫어");
		inputVO.setWriter("이정민");
		List<BoardVO> boardList = 
		sqlSession.selectList("mybatis.BoardDAO.selectDSQL", inputVO);
		
		for (BoardVO vo : boardList) {
			System.out.println(vo.toString());
		}
	}
	
	public void selectDSQLif() {
		BoardVO vo = new BoardVO();
//		vo.setTitle("2번째");
		List<BoardVO> boardList = sqlSession.selectList("mybatis.BoardDAO.selectDSQLif", vo);
		
		for (BoardVO vos : boardList) {
			System.out.println(vos.toString());
		}
	}
	public void selectDSQLif2() {
		BoardVO vo = new BoardVO();
		List<BoardVO> boardList = sqlSession.selectList("mybatis.BoardDAO.selectDSQLif", "2번째");
		
		for (BoardVO vos : boardList) {
			System.out.println(vos.toString());
		}
	}
	public void selectForEach() {
		int[] arr = {1, 2, 3, 4, 5};
		List<BoardVO> boardList = sqlSession.selectList("mybatis.BoardDAO.selectForEach", arr);
		for (BoardVO vos : boardList) {
			System.out.println(vos.toString());
		}
	}
	public void selectForEach2() {
		BoardVO vo = new BoardVO();
		int[] arr = {1, 2, 3, 4, 5};
		vo.setNumbers(arr);
		List<BoardVO> boardList = sqlSession.selectList("mybatis.BoardDAO.selectForEach2", vo);
		for (BoardVO vos : boardList) {
			System.out.println(vos.toString());
		}
	}
}