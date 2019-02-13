package model.dao;

import java.util.ArrayList;
import java.util.List;

import model.vo.Skill;

public class SkillDao {

	private List<Skill> ns_list;
	private List<Skill> fs_list;
	private List<Skill> ws_list;
	private List<Skill> gs_list;
	
	public SkillDao() {
		
		//�븻
		ns_list.add(new Skill("��ġ",0,20));
		ns_list.add(new Skill("��������",0,20));
		ns_list.add(new Skill("���ݸ����̱�",0,30));
		//��
		ws_list.add(new Skill("�Ҵ빮��",2,20));
		ws_list.add(new Skill("�Ҵ빮��",2,20));
		ws_list.add(new Skill("�Ҵ빮��",2,20));
		ws_list.add(new Skill("�Ҵ빮��",2,20));
		//��
		fs_list.add(new Skill("�ϵ������",1,20));
		fs_list.add(new Skill("�ϵ������",1,20));
		fs_list.add(new Skill("�ϵ������",1,20));
		fs_list.add(new Skill("�ϵ������",1,20));
		
		//Ǯ
		gs_list.add(new Skill("����ν���",3,20));
		gs_list.add(new Skill("����ν���",3,20));
		gs_list.add(new Skill("����ν���",3,20));
		gs_list.add(new Skill("����ν���",3,20));
		
	}

	public List<Skill> getFs_list() {
		return fs_list;
	}

	public void setFs_list(List<Skill> fs_list) {
		this.fs_list = fs_list;
	}

	public List<Skill> getWs_list() {
		return ws_list;
	}

	public void setWs_list(List<Skill> ws_list) {
		this.ws_list = ws_list;
	}

	public List<Skill> getGs_list() {
		return gs_list;
	}

	public void setGs_list(List<Skill> gs_list) {
		this.gs_list = gs_list;
	}

	public List<Skill> getNs_list() {
		return ns_list;
	}

	public void setNs_list(List<Skill> ns_list) {
		this.ns_list = ns_list;
	}
	
	
	

	
}
