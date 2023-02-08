package com.smartdatasolutions.test.impl;

import com.smartdatasolutions.test.Member;
import com.smartdatasolutions.test.MemberImporter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MemberImporterImpl implements MemberImporter {

	@Override
	public List< Member > importMembers( File inputFile ) throws Exception {

		/*
		 * Implement the missing logic
		 */
		final List<Member> members = new ArrayList<>();

		try (BufferedReader br = new BufferedReader( new FileReader( inputFile ) )) {
			String line = br.readLine( );

			while ( line != null ) {
				line = br.readLine( );

				final Member member = new Member();
				String[] parts = line.split("\\s+");

				member.setId(parts[0].trim());
				member.setLastName(parts[1].trim());
				member.setFirstName(parts[2].trim());
				member.setAddress(parts[3].trim());
				member.setCity(parts[4].trim());
				member.setState(parts[5].trim());
				member.setZip(parts[6].trim());

				members.add(member);
			}
		}

		return members;
	}

}
