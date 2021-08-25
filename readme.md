# Player-data minecraft plugin
## Brief introduction
When I initially begun to develop minecraft plugins, I was still very new to programming as a whole. Because of this, I wasn't at the point where I could easily approach databases, specifically MySQL which is popular for server-hosting platforms. 

Because of this hesitancy, I decided to use a file system I was comfortable with and create my own on-server player data storage via the .yaml file format.

While this project is quite short, the basics of the program was that every time a player joined the server, it would check if the player existed in the "database", and if it hadn't it would create a new .yaml file which contained a small amount of information.

Because I quickly moved away from minecraft plugins, I didn't extend this project much, but initially I had the plugin setup to create a total login stats *as a test* as well as a section related to my [hardcore-factions](https://github.com/westshae/hardcore-factions) which stored basic information connected to that plugin.

## Future information
For those that might find an interest in a plugin similar to this, I'd highly recommend you spend a bit of time learning about database's such as MySQL, as they are much better and most plugins support those rather than a small plugin such as mine. That's what I'd do, and therefore this project is now dead in the water.


*Please note, this readme.md file was created 17 months after the final commit, which means I might miss certain features, or be incorrect with certain points*
