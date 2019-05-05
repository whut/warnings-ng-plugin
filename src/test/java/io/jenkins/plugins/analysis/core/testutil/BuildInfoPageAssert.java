package io.jenkins.plugins.analysis.core.testutil;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;

import io.jenkins.plugins.analysis.warnings.recorder.pageobj.BuildInfoPage;

/**
 * {@link BuildInfoPage} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class BuildInfoPageAssert
        extends AbstractObjectAssert<BuildInfoPageAssert, BuildInfoPage> {

  /**
   * Creates a new <code>{@link BuildInfoPageAssert}</code> to make assertions on actual BuildInfoPage.
   * @param actual the BuildInfoPage we want to make assertions on.
   */
  public BuildInfoPageAssert(BuildInfoPage actual) {
    super(actual, BuildInfoPageAssert.class);
  }

  /**
   * An entry point for BuildInfoPageAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myBuildInfoPage)</code> and get specific assertion with code completion.
   * @param actual the BuildInfoPage we want to make assertions on.
   * @return a new <code>{@link BuildInfoPageAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static BuildInfoPageAssert assertThat(BuildInfoPage actual) {
    return new BuildInfoPageAssert(actual);
  }

  /**
   * Verifies that the actual BuildInfoPage's errorMessages contains the given String elements.
   * @param errorMessages the given elements that should be contained in actual BuildInfoPage's errorMessages.
   * @return this assertion object.
   * @throws AssertionError if the actual BuildInfoPage's errorMessages does not contain all given String elements.
   */
  public BuildInfoPageAssert hasErrorMessages(String... errorMessages) {
    // check that actual BuildInfoPage we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (errorMessages == null) failWithMessage("Expecting errorMessages parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getErrorMessages(), errorMessages);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BuildInfoPage's errorMessages contains the given String elements in Collection.
   * @param errorMessages the given elements that should be contained in actual BuildInfoPage's errorMessages.
   * @return this assertion object.
   * @throws AssertionError if the actual BuildInfoPage's errorMessages does not contain all given String elements.
   */
  public BuildInfoPageAssert hasErrorMessages(java.util.Collection<? extends String> errorMessages) {
    // check that actual BuildInfoPage we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (errorMessages == null) {
      failWithMessage("Expecting errorMessages parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getErrorMessages(), errorMessages.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BuildInfoPage's errorMessages contains <b>only</b> the given String elements and nothing else in whatever order.
   * @param errorMessages the given elements that should be contained in actual BuildInfoPage's errorMessages.
   * @return this assertion object.
   * @throws AssertionError if the actual BuildInfoPage's errorMessages does not contain all given String elements.
   */
  public BuildInfoPageAssert hasOnlyErrorMessages(String... errorMessages) {
    // check that actual BuildInfoPage we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (errorMessages == null) failWithMessage("Expecting errorMessages parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getErrorMessages(), errorMessages);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BuildInfoPage's errorMessages contains <b>only</b> the given String elements in Collection and nothing else in whatever order.
   * @param errorMessages the given elements that should be contained in actual BuildInfoPage's errorMessages.
   * @return this assertion object.
   * @throws AssertionError if the actual BuildInfoPage's errorMessages does not contain all given String elements.
   */
  public BuildInfoPageAssert hasOnlyErrorMessages(java.util.Collection<? extends String> errorMessages) {
    // check that actual BuildInfoPage we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (errorMessages == null) {
      failWithMessage("Expecting errorMessages parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getErrorMessages(), errorMessages.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BuildInfoPage's errorMessages does not contain the given String elements.
   *
   * @param errorMessages the given elements that should not be in actual BuildInfoPage's errorMessages.
   * @return this assertion object.
   * @throws AssertionError if the actual BuildInfoPage's errorMessages contains any given String elements.
   */
  public BuildInfoPageAssert doesNotHaveErrorMessages(String... errorMessages) {
    // check that actual BuildInfoPage we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (errorMessages == null) failWithMessage("Expecting errorMessages parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getErrorMessages(), errorMessages);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BuildInfoPage's errorMessages does not contain the given String elements in Collection.
   *
   * @param errorMessages the given elements that should not be in actual BuildInfoPage's errorMessages.
   * @return this assertion object.
   * @throws AssertionError if the actual BuildInfoPage's errorMessages contains any given String elements.
   */
  public BuildInfoPageAssert doesNotHaveErrorMessages(java.util.Collection<? extends String> errorMessages) {
    // check that actual BuildInfoPage we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (errorMessages == null) {
      failWithMessage("Expecting errorMessages parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getErrorMessages(), errorMessages.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BuildInfoPage has no errorMessages.
   * @return this assertion object.
   * @throws AssertionError if the actual BuildInfoPage's errorMessages is not empty.
   */
  public BuildInfoPageAssert hasNoErrorMessages() {
    // check that actual BuildInfoPage we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have errorMessages but had :\n  <%s>";

    // check
    if (actual.getErrorMessages().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getErrorMessages());
    }

    // return the current assertion for method chaining
    return this;
  }


  /**
   * Verifies that the actual BuildInfoPage's infoMessages contains the given String elements.
   * @param infoMessages the given elements that should be contained in actual BuildInfoPage's infoMessages.
   * @return this assertion object.
   * @throws AssertionError if the actual BuildInfoPage's infoMessages does not contain all given String elements.
   */
  public BuildInfoPageAssert hasInfoMessages(String... infoMessages) {
    // check that actual BuildInfoPage we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (infoMessages == null) failWithMessage("Expecting infoMessages parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getInfoMessages(), infoMessages);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BuildInfoPage's infoMessages contains the given String elements in Collection.
   * @param infoMessages the given elements that should be contained in actual BuildInfoPage's infoMessages.
   * @return this assertion object.
   * @throws AssertionError if the actual BuildInfoPage's infoMessages does not contain all given String elements.
   */
  public BuildInfoPageAssert hasInfoMessages(java.util.Collection<? extends String> infoMessages) {
    // check that actual BuildInfoPage we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (infoMessages == null) {
      failWithMessage("Expecting infoMessages parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getInfoMessages(), infoMessages.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BuildInfoPage's infoMessages contains <b>only</b> the given String elements and nothing else in whatever order.
   * @param infoMessages the given elements that should be contained in actual BuildInfoPage's infoMessages.
   * @return this assertion object.
   * @throws AssertionError if the actual BuildInfoPage's infoMessages does not contain all given String elements.
   */
  public BuildInfoPageAssert hasOnlyInfoMessages(String... infoMessages) {
    // check that actual BuildInfoPage we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (infoMessages == null) failWithMessage("Expecting infoMessages parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getInfoMessages(), infoMessages);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BuildInfoPage's infoMessages contains <b>only</b> the given String elements in Collection and nothing else in whatever order.
   * @param infoMessages the given elements that should be contained in actual BuildInfoPage's infoMessages.
   * @return this assertion object.
   * @throws AssertionError if the actual BuildInfoPage's infoMessages does not contain all given String elements.
   */
  public BuildInfoPageAssert hasOnlyInfoMessages(java.util.Collection<? extends String> infoMessages) {
    // check that actual BuildInfoPage we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (infoMessages == null) {
      failWithMessage("Expecting infoMessages parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getInfoMessages(), infoMessages.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BuildInfoPage's infoMessages does not contain the given String elements.
   *
   * @param infoMessages the given elements that should not be in actual BuildInfoPage's infoMessages.
   * @return this assertion object.
   * @throws AssertionError if the actual BuildInfoPage's infoMessages contains any given String elements.
   */
  public BuildInfoPageAssert doesNotHaveInfoMessages(String... infoMessages) {
    // check that actual BuildInfoPage we want to make assertions on is not null.
    isNotNull();

    // check that given String varargs is not null.
    if (infoMessages == null) failWithMessage("Expecting infoMessages parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getInfoMessages(), infoMessages);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BuildInfoPage's infoMessages does not contain the given String elements in Collection.
   *
   * @param infoMessages the given elements that should not be in actual BuildInfoPage's infoMessages.
   * @return this assertion object.
   * @throws AssertionError if the actual BuildInfoPage's infoMessages contains any given String elements.
   */
  public BuildInfoPageAssert doesNotHaveInfoMessages(java.util.Collection<? extends String> infoMessages) {
    // check that actual BuildInfoPage we want to make assertions on is not null.
    isNotNull();

    // check that given String collection is not null.
    if (infoMessages == null) {
      failWithMessage("Expecting infoMessages parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getInfoMessages(), infoMessages.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual BuildInfoPage has no infoMessages.
   * @return this assertion object.
   * @throws AssertionError if the actual BuildInfoPage's infoMessages is not empty.
   */
  public BuildInfoPageAssert hasNoInfoMessages() {
    // check that actual BuildInfoPage we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have infoMessages but had :\n  <%s>";

    // check
    if (actual.getInfoMessages().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getInfoMessages());
    }

    // return the current assertion for method chaining
    return this;
  }


}
