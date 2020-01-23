package di.constructor03;

public class WriteArticleMgr implements IWriteArticleMgr {
	private IArticleDAO dao;
	
	public WriteArticleMgr(IArticleDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void write(ArticleDTO dto) {
		dao.insert(dto);
		System.out.println("write");
	}

}
