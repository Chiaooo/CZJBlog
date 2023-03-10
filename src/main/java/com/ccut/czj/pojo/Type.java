package com.ccut.czj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author czj
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Type {
	private Long id;
	private String name;
	private List<Blog> blogs = new ArrayList<>();
}
