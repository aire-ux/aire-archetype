import {
  ${component-type-name}
} from "@${organization}/${component-name}/${component-name}";

export default function setup() {


  window.customElements.define(
      '${component-name}',
      ${component-type-name}
  );
  Object.defineProperty(window.location, 'href', {
    writable: true,
    value: 'https://localhost'
  });
  // (window as any).chai.use(chaiDomDiff);
}
setup();