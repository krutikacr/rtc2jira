package to.rtc.rtc2jira.importer.mapping.spi;

import java.util.ServiceLoader;

/**
 * Implement this factory and make it available via {@link ServiceLoader} to register your own
 * mappings.
 * 
 * @author roman
 *
 */
public interface MappingFactory {

  /**
   * Called once at startup. Register your mappers here.
   * 
   * @param registry
   */
  public void registerMappings(MappingRegistry registry);
}
