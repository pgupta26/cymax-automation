package com.qualitesoft.utils.json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Slf4j
public class JsonStringUtil {

  private static Gson gson = new Gson();


  private JsonStringUtil () {

  }


  public static <T> JsonStringUtilBuilder<T> get (Class<T> type) {

    return new JsonStringUtilBuilder<>(type);
  }


  public static <T> JsonStringUtilBuilder<List<T>> getList (Class<T> type) {

    return new JsonStringUtilBuilder<>(TypeToken.getParameterized(ArrayList.class, type).getType());
  }


  public static JsonStringUtilBuilder<Map<String, Object>> getMap () {

    return new JsonStringUtilBuilder<>(new TypeToken<Map<String, Object>>() {
    }.getType());
  }


  public static Map<String, Object> getMapFromJsonString (String json) {

    Type type = new TypeToken<Map<String, String>>() {
    }.getType();

    return gson.fromJson(json, type);
  }

  public static <T> String jsonToString(T object) {
    return gson.toJson(object);
  }


  public static class JsonStringUtilBuilder<T> {

    Type type;


    private JsonStringUtilBuilder (Type type) {

      this.type = type;
    }


    public T fromJsonString (String jsonString) {

      return gson.fromJson(jsonString, type);
    }
  }
}

