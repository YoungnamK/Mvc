package dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dao")

public class AlbumDao {
	private final String namespace="NsAlbum";
	
	@Autowired
	SqlSessionTemplate abcd;
	public int GetTotalCount() {
		int cnt=-1;
		cnt = this.abcd.selectOne(namespace+".getTotalCount");
		return cnt;
	}
}
