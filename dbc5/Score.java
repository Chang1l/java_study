package dbc5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Score {
	public int insertDate() {
		int result = 0;
		Connection conn = DBConn.getConnection();//연결
		Statement stmt = null; //단순 쿼리 명령문
		String sql, hak, name;
		int kor, eng, mat;
		Scanner br = new Scanner(System.in); //입력 객체

		try {
			System.out.print("학번?");
			hak = br.nextLine();
			System.out.print("이름?");
			name = br.nextLine();
			System.out.print("국어?");
			kor = Integer.parseInt(br.nextLine());
			System.out.print("영어?");
			eng = Integer.parseInt(br.nextLine());
			System.out.print("수학?");
			mat = Integer.parseInt(br.nextLine());

			sql = "INSERT INTO score (hak, name, kor, eng, mat) VALUES (";
			sql += "'" + hak + "'," + "'" + name + "',";
			sql += "" + kor + "," + "" + eng + "," + "" + mat + ")";
			stmt = conn.createStatement(); //명령문 생성
			result = stmt.executeUpdate(sql); //쿼리 실행 및 줄 수 저장

			stmt.close(); //명령문 종료
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	public void selectAll() {
		Statement stmt = null; //단순 쿼리 명령문
		ResultSet rs = null; //결과처리
		String sql, hak, name, str;
		int kor, eng, mat, tot, ave;
		Connection conn = DBConn.getConnection(); //연결

		try {
			sql = "SELECT hak, name, kor, eng, mat,";
			sql += "(kor+eng+mat) AS tot,"; // 문자 인덱스 사용을 위해 별칭 필요
			sql += "(kor+eng+mat)/3 AS ave "; // 문자 인덱스 사용을 위해 별칭 필요
			sql += " FROM score ORDER BY hak";
			stmt = conn.createStatement(); //생성
			rs = stmt.executeQuery(sql);// 쿼리 실행

			while (rs.next()) {//레코드 
				hak = rs.getString(1); //hak
				name = rs.getString("name");
				kor = rs.getInt(3);//kor
				eng = rs.getInt(4);//eng
				mat = rs.getInt(5);//mat
				tot = rs.getInt(6);//tot
				ave = rs.getInt(7);//ave
				str = String.format("%-10s %-15s %5d %5d %5d %5d %5d",
					hak, name, kor, eng, mat, tot, ave);
				System.out.println(str);
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void selectName() {
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = DBConn.getConnection();
		String sql, str, searchName, hak, name;
		int kor, eng, mat, tot, ave;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//입력버퍼
		try {
			System.out.print("검색할 이름?");
			searchName = br.readLine(); //입력받은 값 저장
			sql = "SELECT hak, name, kor, eng, mat,";
			sql += "(kor+eng+mat) AS tot,";
			sql += "(kor+eng+mat)/3 AS ave";
			sql += " FROM score";
			sql += " WHERE upper(name) LIKE upper('" + searchName + "%')"; //입력받은 값으로 시작하는 이름 검색 대문자
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				hak = rs.getString(1);
				name = rs.getString("name");
				kor = rs.getInt(3);
				eng = rs.getInt(4);
				mat = rs.getInt(5);
				tot = rs.getInt(6);
				ave = rs.getInt(7);
				str = String.format("%-10s %-15s %5d %5d %5d %5d %5d", 
					hak, name, kor, eng, mat, tot, ave);
				System.out.println(str);
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
		}
	}

	public int deleteDate() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql, str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("삭제할 학번?");
			str = br.readLine();//입력
			sql = "DELETE FROM score WHERE hak='" + str + "'";//입력값 해당 학번 삭제
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);

			stmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	public int updateData() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql, hak, name;
		int kor, eng, mat;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("수정할 학번?");
			hak = br.readLine();
			System.out.print("이름?");
			name = br.readLine();
			System.out.print("국어?");
			kor = Integer.parseInt(br.readLine());
			System.out.print("영어?");
			eng = Integer.parseInt(br.readLine());
			System.out.print("수학?");
			mat = Integer.parseInt(br.readLine());

			sql = "UPDATE score SET ";
			sql += "name='" + name + "',";
			sql += "kor=" + kor + ",";
			sql += "eng=" + eng + ",";
			sql += "mat=" + mat + "";
			sql += " WHERE hak='" + hak + "'";
			System.out.println(sql);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);

			stmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}
}
