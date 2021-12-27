package constants;

@org.aeonbits.owner.Config.Sources(
        "file:./src/test/resources/config/config.properties"
)
public interface Config extends org.aeonbits.owner.Config {
    @Key("browser")
    String browser();

    @Key("base_url")
    String baseUrl();
}
