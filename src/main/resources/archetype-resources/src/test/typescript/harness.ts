import {
  ${component-name.substring(0,1).toUpperCase()}${component-name.substring(1)}
} from "@${organization}/${component-name}/${component-name}";

export default function setup() {


  window.customElements.define(
      '${component-name}',
      ${component-name.substring(0,1).toUpperCase()}${component-name.substring(1)});
  Object.defineProperty(window.location, 'href', {
    writable: true,
    value: 'https://localhost'
  });
  // (window as any).chai.use(chaiDomDiff);
}
setup();