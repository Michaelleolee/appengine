package oop.appengine.examples.showcase.repository.mybatis;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import oop.appengine.examples.showcase.entity.Team;
import oop.appengine.modules.test.spring.SpringTransactionalTestCase;

@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class TeamMybatisDaoTest extends SpringTransactionalTestCase {

	@Autowired
	private TeamMybatisDao teamDao;

	@Test
	public void getTeamWithDetail() throws Exception {
		Team team = teamDao.getWithDetail(1L);
		assertEquals("Dolphin", team.getName());
		assertEquals("管理员", team.getMaster().getName());
	}

}
