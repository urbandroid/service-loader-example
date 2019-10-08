import sukumaar.spi.GreetService;

module service.provider.asgard {
    requires service.api.example;
    provides GreetService with sukumaar.asgard.AsgardGreetService;
}