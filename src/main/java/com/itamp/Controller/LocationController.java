package com.itamp.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itamp.Model.DS;
import com.itamp.Model.GN;
import com.itamp.Model.MOH;
import com.itamp.Model.PHM;
import com.itamp.Model.RDHS;
import com.itamp.Repository.DSRepository;
import com.itamp.Repository.GNRepository;
import com.itamp.Repository.MOHRepository;
import com.itamp.Repository.PHMRepository;
import com.itamp.Repository.RDHSRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200" ,maxAge= 3600)
public class LocationController {

	@Autowired
	private RDHSRepository rdhsRepository;
	@Autowired
	private DSRepository dsRepository;
	@Autowired
	private MOHRepository mohRepository;
	@Autowired
	private PHMRepository phmRepository;
	@Autowired
	private GNRepository gnRepository;
	
	@GetMapping("/rdhs")
	private List<RDHS> rdhs(){
		return rdhsRepository.findAll();
	}
   	
	@GetMapping("/ds")
	private List<DS> ds(){
		List<DS> dss=new ArrayList<>();
	    dsRepository.
	    findAll().forEach(dss::add);
	    return dss;
		}
	
	// get ds names using rdhs name
	@GetMapping("/dsbyrdhs")
	private List<DS> dsAreasForOneRdhs(@RequestParam String name ){
		System.out.println("name = " +name);
	  List<DS> rd=new ArrayList<DS>();
	  List<String> dsname=new ArrayList<String>();
	   rd=rdhsRepository.findByName(name).getDs();
		for(DS d:rd) {
			dsname.add(d.getName());
		}
		return rd;
	}
	  
	@GetMapping("/moh")
	private List<MOH> moh(){
		return mohRepository.findAll();
	}
	
	//get moh names using ds name
	@GetMapping("/mohbyds")
	private List<MOH> mohAreasForOneDs(@RequestParam String name){
		List<MOH> mo=new ArrayList<MOH>();
		List<String> mohname=new ArrayList<String>();
		mo=dsRepository.findByName(name).getMoh();
		for(MOH m:mo) {
			mohname.add(m.getName());
		}
		return mo;
	}
	
	@GetMapping("/phm")
	private List<PHM> phm(){
		return phmRepository.findAll();
	}
	
	//get phm names using moh name
	@GetMapping("/phmbymoh")
	private List<PHM> phmAreasForOneMoh(@RequestParam String name){
		List<PHM> ph=new ArrayList<PHM>();
		List<String> mohname=new ArrayList<String>();
		ph=mohRepository.findByName(name).getPhm();
		for(PHM p:ph) {
			mohname.add(p.getName());
		}
		return ph;
	}
	@GetMapping("/gn")
	private List<GN> gn(){
		return gnRepository.findAll();
	}
	//get phm names using moh name
		@GetMapping("/gnbyphm")
		private List<GN> gnAreasForOnePhm(@RequestParam String name){
			List<GN> gn=new ArrayList<GN>();
			List<String> mohname=new ArrayList<String>();
			gn=phmRepository.findByName(name).getGn();
			for(GN gg:gn) {
				mohname.add(gg.getName());
			}
			return gn;
		}
}
