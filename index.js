import slint from "slint-ui";

let ui = slint.loadSource(
  `
    import { AboutSlint } from "std-widgets.slint";
    export component Demo inherits Window { AboutSlint {} } 
`,
  "main.slint",
);

let demo = new ui.Demo();

await demo.run();
