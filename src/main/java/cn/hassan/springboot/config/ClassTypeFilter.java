package cn.hassan.springboot.config;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/10/28 11:30
 * Description:
 */
public class ClassTypeFilter implements TypeFilter {

	/**
	 *
	 * @param metadataReader 读取到的当前正在扫描的类的信息
	 * @param metadataReaderFactory 可以获取到其他任何类信息的
	 * @return
	 * @throws IOException
	 */
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		String className = classMetadata.getClassName();
		if (className.endsWith("er")){
			return true;
		}
		return false;
	}
}
