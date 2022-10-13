import "./harness";

import {
  fixture,
  expect, nextFrame,
} from "@open-wc/testing";

import {
  beforeEach,
  describe,
  it,
  vi
} from "vitest";
import {
  ${component-type-name}
} from "@${organization}/${component-name}/${component-name}"


import {html} from "lit";


describe('a ${component-name}', async () => {
  let element: ${component-type-name};
  beforeEach(async () => {
    element = await fixture(html`
      <${component-name}></${component-name}>
    `);

    await nextFrame();
  });

  it('should mount the component', () => {
    let elements = document.querySelectorAll('${component-name}');
    expect(elements.length).to.equal(1);
  });

});