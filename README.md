# aire-archetype
Maven Archetype for Aire-UX components

## Development:

To build:

```bash
mvn clean install -Dgpg.skip=true
```

## Usage:

Archetype properties:

1. archetypeGroupId: io.sunshower.aire
2. archetypeArtifactId: aire-component-archetype
3. archetypeVersion: <current version>
4. groupId: whatever you would like your component's group id to be.  Ex: com.myapp.mywidget
5. artifactId: the name of your project.  Ex: aire-wizard
6. organization: your github organization. Ex: aire-ux
7. component-name: the name of your LitElement tag

```bash
mvn archetype:generate \
-DarchetypeGroupId=io.sunshower.aire \
-DarchetypeArtifactId=aire-component-archetype
```

Generates:
```
├── bom
│   ├── exported
│   │   └── pom.xml
│   ├── imported
│   │   └── pom.xml
│   └── pom.xml
├── build.gradle
├── check
│   ├── pmd
│   │   └── rules
│   │       └── errorprone.xml
│   └── spotbugs
│       └── exclusions.xml
├── gradle.properties
├── gulpfile.ts
├── package.json
├── pom.xml
├── settings
│   └── settings.xml
├── settings.gradle
├── src
│   ├── development
│   │   └── java
│   │       └── component
│   │           └── test
│   │               └── widget
│   │                   ├── routes
│   │                   │   └── WidgetRoute.java
│   │                   └── WidgetDemoApplication.java
│   ├── main
│   │   ├── java
│   │   │   └── component
│   │   │       └── test
│   │   │           └── widget
│   │   │               └── Widget.java
│   │   ├── resources
│   │   │   ├── paths.development
│   │   │   ├── paths.production
│   │   │   └── templates
│   │   │       ├── Paths.java
│   │   │       └── Versions.java
│   │   ├── scss
│   │   │   └── test-widget.scss
│   │   └── typescript
│   │       ├── index.ts
│   │       └── test-widget.ts
│   └── test
│       ├── java
│       │   └── component
│       │       └── test
│       │           └── widget
│       │               └── WidgetTest.java
│       └── typescript
│           ├── harness.ts
│           ├── setup.ts
│           └── test-widget.test.ts
├── tasks
│   └── revisions.gradle
├── tsconfig.json
├── types.d.ts
└── vitest.config.ts

```

To run, simply run:
1. npm install
2. gradle clean build pTML sA develop -Pdevelopment -x sign



