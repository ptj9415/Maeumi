package co.maeumi.prj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping("/counselorinfo.do")
	public String counselorinfo(Model model) {
		return "admin/counselorinfo";
	}
	
	@RequestMapping("/mycareer.do")
	public String mycareer(Model model) {
		return "admin/mycareer";
	}
	
	@RequestMapping("/mycertification.do")
	public String mycertification(Model model) {
		return "admin/mycertification";
	}
	
	@RequestMapping("/mycounseltime.do")
	public String mycounseltime(Model model) {
		return "admin/mycounseltime";
	}
	
	@RequestMapping("/myintro.do")
	public String myintro(Model model) {
		return "admin/myintro";
	}
	
}
