package co.maeumi.prj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.maeumi.prj.service.MemberService;

@Controller
public class AdminController {
	@Autowired
	private MemberService memberDao;
	
	@RequestMapping("/admin.do")
	public String home(Model model) {
		model.addAttribute("member", memberDao.memberSelectList());
		return "admin/admin";
	}
	
}
