package com.axellience.vuegwt.core.client.customelement;

import com.axellience.vuegwt.core.client.component.IsVueComponent;
import elemental2.core.JsArray;
import elemental2.dom.Element;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.JsPropertyMap;

@JsType(isNative = true, namespace = "<global>", name = "Element")
public class VueCustomElement<T extends IsVueComponent> extends Element {

  @JsProperty
  private JsPropertyMap<JsArray<T>> __vue_custom_element__;

  @JsOverlay
  public final T getComponent() {
    return this.__vue_custom_element__.get("$children").getAt(0);
  }
}
