module service.provider.earth {
    requires service.api.example;
    provides sukumaar.spi.GreetService with sukumaar.earth.EarthGreetService;
}