package com.biz.student.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.biz.student.domain.StudentVO;

/*
 * student.txt 파일을 읽어서 studentList에 저장하고
 * student_list.txt 파일에 학생명부 출력
 * 
 * inputStudent method를 변경하여 
 * 전공이 컴퓨터공학인 학생들만 리스트를 출력
 */
public class StudentServiceImplV5 extends StudentServiceImplV2 {
	
	public StudentServiceImplV5() {
		outPut = System.out;
	}

	
	@Override
	public boolean inputStudent() {

		String studentFile = "src/com/biz/student/exec/students.txt";

		
		FileReader fileReader = null;

		
		BufferedReader buffer = null;

		try {
			// 읽어들일 파일을 열고, 파일에 관련된 정보를 fileReader 객체에 저장
			fileReader = new FileReader(studentFile);

			
			buffer = new BufferedReader(fileReader);

			String reader = "";
			
			
			while(true) {
				
				reader = buffer.readLine();
				if(reader == null) {
					break;
				}
				// System.out.println(reader);
				
				// 읽어들인 라인을 분해하여 학생정보로 변환
				String[] students = reader.split(":");
				
				StudentVO sVO = new StudentVO();
				sVO.setNum(students[0]);
				sVO.setName(students[1]);
				sVO.setGrade(Integer.valueOf(students[2]));
				sVO.setDept(students[4]);
				
				String dept = sVO.getDept();
				
				if(dept.contains("컴퓨터공학")) {
					studentList.add(sVO);
				}
				
				
			}
			
			// 파일을 읽기 쓰기로 열었으면 모두 닫아서 종료해주어야 한다.
			buffer.close();
			fileReader.close();
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return true;
	}

}
