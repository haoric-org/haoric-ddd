# Haoric DDD

> 🌱 一个简洁清晰的领域驱动设计（DDD）构建框架，致力于打造高可维护、高内聚、低耦合的业务系统。

---

## 📋 项目概述

Haoric DDD 是一个完整的 DDD 开发解决方案，包含项目启动器、代码生成器和桌面应用。它提供了从项目初始化到代码生成的全流程支持，让您能够快速构建符合领域驱动设计原则的企业级应用。

### 🎯 设计理念

本项目旨在提供一种 **轻量但严谨的 DDD 实践方式**，帮助团队在保持业务模型清晰性的前提下，加快开发效率并确保系统的可演进性。通过合理分层和职责划分，避免过度工程，同时为未来的演化预留空间。

### 🌟 核心优势

- **🚀 快速启动**: 一键生成完整的 DDD 项目结构
- **🎯 架构清晰**: 严格遵循 DDD 分层架构原则
- **🔧 开箱即用**: 内置完整的工具链和配置
- **📈 可扩展**: 支持自定义模板和扩展
- **🔄 持续演进**: 基于最新技术栈，持续更新维护

## 🎯 核心特性

- ✅ **基于 DDD（领域驱动设计）原则** 构建项目骨架，关注业务模型本身
- ✅ **CQRS 架构**：命令 / 查询职责分离，提高系统的扩展性和读写性能
- ✅ **去事件化设计**：不依赖事件驱动模型，控制复杂度，适用于大部分业务系统
- ✅ **Spring Boot 4.1.1**：基于最新版本构建，生态完备
- ✅ **Java 25**：使用最新 LTS 版本，拥抱现代语法与性能提升
- ✅ **多平台支持**：Web 界面和桌面应用双重体验
- ✅ **智能代码生成**：可视化配置，自动生成 DDD 项目结构
- ✅ **模板化设计**：支持自定义代码生成模板
- ✅ **实时预览**：代码生成结果实时预览
- ✅ **环境检查**：自动检查和安装依赖

## 🏗️ 项目架构

### 📁 项目结构

```
haoric-ddd/
├── haoric-ddd-starter/                     # 🚀 DDD 项目启动器
│   ├── src/main/java/org/haoric/ddd/starter/
│   │   └── common/                          # 公共模块
│   │       ├── config/                      # 配置类
│   │       │   ├── data/                   # 数据配置
│   │       │   │   ├── cache/              # 缓存配置
│   │       │   │   └── persistence/        # 持久化配置
│   │       │   ├── haoric/                # Haoric 配置
│   │       │   │   ├── constant/           # 常量定义
│   │       │   │   └── properties/         # 属性配置
│   │       │   ├── log/                    # 日志配置
│   │       │   ├── minio/                  # MinIO 配置
│   │       │   ├── rest/                   # REST 配置
│   │       │   └── thread/                 # 线程配置
│   │       ├── exception/                  # 异常处理
│   │       ├── handler/                    # 处理器
│   │       ├── model/                      # 模型定义
│   │       └── utils/                      # 工具类
│   └── pom.xml                             # Maven 配置
├── haoric-ddd-generator/                   # 🔧 代码生成器
│   ├── haoric-ddd-generator-core/         # Spring Boot 核心模块
│   ├── haoric-ddd-generator-components/   # 组件模块
│   ├── haoric-ddd-generator-common/       # 公共模块
│   ├── haoric-ddd-generator-ui/           # Tauri 桌面应用
│   ├── model/                              # 示例模型文件
│   └── config/                             # 配置文件
└── README.md                               # 项目说明
```

### 🎯 分层架构

```
haoric-ddd
├── application     // 应用服务层（协调命令/查询，封装用例逻辑）
├── domain          // 领域层（聚合根、实体、值对象、仓储接口等）
├── infrastructure  // 基础设施层（数据库实现、消息、外部系统适配器、被动适配器）
├── facade          // 界面层（主动适配器）
└── sidecar         // 服务网格边车层（Controller, 服务网格接入）
```

每一层职责清晰，便于协作开发、维护和模块重用。

### 🔄 数据流架构

```
┌─────────────┐    ┌─────────────┐    ┌─────────────┐
│   Facade    │───▶│ Application │───▶│   Domain    │
│   Layer     │    │   Service   │    │   Layer     │
└─────────────┘    └─────────────┘    └─────────────┘
       │                   │                   │
       ▼                   ▼                   ▼
┌─────────────┐    ┌─────────────┐    ┌─────────────┐
│   Query     │    │  Command    │    │ Repository  │
│   Service   │    │  Handler    │    │  Interface  │
└─────────────┘    └─────────────┘    └─────────────┘
       │                   │                   │
       └───────────────────┼───────────────────┘
                           ▼
                   ┌─────────────┐
                   │Infrastructure│
                   │   Layer     │
                   └─────────────┘
```

## 🚀 子项目介绍

### 📦 [HaoricDDD Starter](./haoric-ddd-starter/)

> 🚀 一个简洁清晰的领域驱动设计（DDD）启动器模块，提供完整的 DDD 项目骨架和基础设施。

**核心功能：**

- ✅ DDD 架构支持：分层架构、聚合设计、仓储模式
- ✅ 现代化技术栈：Java 21、Spring Boot 3.3.5、CQRS 架构
- ✅ 开箱即用：自动配置、工具类库、异常处理、日志系统
- ✅ 安全集成：JWT 认证、权限控制、加密工具
- ✅ 数据支持：多数据源、缓存、事务管理

**[查看详情 →](./haoric-ddd-starter/README.md)**

### 🔧 [HaoricDDD Generator](./haoric-ddd-generator/)

> 🚀 一个基于 Spring Boot 和 Tauri 的 DDD 项目生成器，支持 Web 界面和桌面应用，让您快速创建符合 DDD 原则的项目结构。

**核心功能：**

- ✅ 多平台支持：Web 界面和桌面应用
- ✅ 智能生成：DDD 架构、分层设计、CQRS 支持、模板系统
- ✅ 开发体验：可视化配置、实时预览、一键部署、环境检查
- ✅ 模板系统：Freemarker 模板引擎、自定义模板
- ✅ 配置管理：YAML 配置、环境分离、配置验证

**[查看详情 →](./haoric-ddd-generator/README.md)**

### 🖥️ [HaoricDDD Generator UI](./haoric-ddd-generator-ui/)

> 🖥️ 一个基于 Tauri 的现代化桌面应用程序，用于简化 DDD（领域驱动设计）项目的代码生成，提供原生桌面体验和强大的项目生成功能。

**核心功能：**

- ✅ 原生桌面体验：基于 Rust 的高性能后端、现代化 UI、跨平台支持
- ✅ 智能项目生成：DDD 架构、分层设计、CQRS 支持、模板系统
- ✅ 开发体验优化：可视化配置、实时预览、文件管理、环境检查
- ✅ 文件系统集成：本地文件操作、项目导入导出
- ✅ 模板管理：可视化模板编辑器、模板版本控制

**[查看详情 →](./haoric-ddd-generator-ui/README.md)**

## 🚀 技术栈

| 技术        | 版本         | 说明                           |
|-------------|--------------|--------------------------------|
| Java        | 25           | 最新 LTS 版本                  |
| Spring Boot | 4.1.1        | 现代化 Web 框架                |
| Rust        | 1.70+        | 高性能系统编程语言             |
| Tauri       | 2.7.0        | 桌面应用框架                   |
| Bootstrap   | 5.x          | 响应式 UI 框架                 |
| Freemarker  | 2.3.32       | 模板引擎                       |
| SQLite      | 3.x          | 嵌入式数据库                   |
| 架构模式    | CQRS         | 命令查询职责分离               |
| 模型设计    | DDD 分层架构 | 领域驱动设计（不使用事件驱动） |

### 🔧 开发工具

| 工具  | 版本          | 说明              |
|-------|---------------|-------------------|
| Maven | 3.6+          | 项目构建工具      |
| Cargo | 1.70+         | Rust 包管理器     |
| Git   | 2.x           | 版本控制          |
| IDE   | IntelliJ IDEA | Java 开发环境     |
| IDE   | VS Code       | Rust/前端开发环境 |

## 🚀 快速开始

### 环境要求

- **Java**: 21+ ([下载地址](https://adoptium.net/))
- **Maven**: 3.6+ ([下载地址](https://maven.apache.org/))
- **操作系统**: Windows 10+, macOS 10.15+, Linux

### 1. 克隆项目

```bash
git clone https://github.com/org-haoric/haoric-ddd.git
cd haoric-ddd
```

### 2. 构建项目

使用自带的 Maven Wrapper（无需预装 Maven）：

```bash
./mvnw clean install
```

或使用本地 Maven：

```bash
mvn clean install
```

### 3. 启动生成器

#### 方式一：Web 界面

```bash
cd haoric-ddd-generator
java -jar haoric-ddd-generator-core/target/haoric-ddd-generator-core-*.jar
```

访问：`http://localhost:60001/`

#### 方式二：桌面应用

```bash
cd haoric-ddd-generator-ui
cargo tauri dev
```

### 4. 创建 DDD 项目

1. **配置项目信息**
    - 项目名称、包名、版本
    - 选择 DDD 架构模式
    - 配置技术栈

2. **设计领域模型**
    - 定义聚合根
    - 设计实体和值对象
    - 配置仓储接口

3. **生成项目代码**
    - 预览项目结构
    - 生成代码文件
    - 下载项目包

## 📖 使用教程

### 🎯 基础教程

#### 1. 创建第一个 DDD 项目

```bash
# 启动生成器
cd haoric-ddd-generator-ui
cargo tauri dev

# 在界面中配置项目
# 1. 输入项目名称: MyFirstDDDProject
# 2. 设置包名: com.example.myddd
# 3. 选择架构: 标准 DDD
# 4. 添加聚合: Order, Customer, Product
# 5. 生成项目
```

#### 2. 使用启动器模块

```xml
<!-- 在生成的项目的 pom.xml 中添加依赖 -->
<dependency>
    <groupId>org.haoric</groupId>
    <artifactId>haoric-ddd-starter</artifactId>
    <version>2.0.0-SNAPSHOT</version>
</dependency>
```

```java
// 在启动类中启用 DDD 功能
@SpringBootApplication
@EnableHaoricDDD
public class MyFirstDDDProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFirstDDDProjectApplication.class, args);
    }
}
```

#### 3. 创建聚合根

```java

@Aggregate
public class Order {

    private OrderId id;

    private CustomerId customerId;

    private List<OrderItem> items;

    private OrderStatus status;

    public void addItem(ProductId productId, int quantity) {
        // 领域逻辑
        OrderItem item = new OrderItem(productId, quantity);
        items.add(item);
    }

    public void confirm() {
        if (items.isEmpty()) {
            throw new DomainException("订单不能为空");
        }
        this.status = OrderStatus.CONFIRMED;
    }
}
```

### 🔧 高级教程

#### 1. 自定义模板

```freemarker
// 自定义聚合根模板
package ${package}.domain.aggregate;

import ${package}.domain.entity.*;
import ${package}.domain.valueobject.*;

@Aggregate
public class ${aggregateName} {
    private ${aggregateName}Id id;
    
    // 构造函数
    public ${aggregateName}(${aggregateName}Id id) {
        this.id = id;
    }
    
    // 领域方法
    public void ${methodName}() {
        // 领域逻辑
    }
}
```

#### 2. 配置自定义模板

```yaml
# 在生成器配置中添加自定义模板
templates:
  custom-aggregate:
    path: "templates/custom-aggregate.ftl"
    output: "src/main/java/{package}/domain/aggregate/{name}.java"
    variables:
      - name: "package"
        type: "string"
        required: true
      - name: "aggregateName"
        type: "string"
        required: true
```

## 📦 下载地址

### 🎯 最新版本

- **GitHub
  Releases**: [https://github.com/org-haoric/haoric-ddd/releases](https://github.com/org-haoric/haoric-ddd/releases)
-

**源码下载**: [https://github.com/org-haoric/haoric-ddd/archive/refs/heads/main.zip](https://github.com/org-haoric/haoric-ddd/archive/refs/heads/main.zip)

### 🖥️ 桌面应用

- **Windows**: `.msi` 安装包
- **macOS**: `.dmg` 安装包
- **Linux**: `.deb` 安装包

### 📚 文档资源

- **项目 Wiki**: [https://github.com/org-haoric/haoric-ddd/wiki](https://github.com/org-haoric/haoric-ddd/wiki)
- **API 文档**: [https://github.com/org-haoric/haoric-ddd/wiki/API](https://github.com/org-haoric/haoric-ddd/wiki/API)
-

**使用教程**: [https://github.com/org-haoric/haoric-ddd/wiki/Tutorial](https://github.com/org-haoric/haoric-ddd/wiki/Tutorial)

## 🔍 常见问题

### ❓ 常见问题解答

#### Q: 为什么选择去事件化设计？

A: 事件驱动虽然强大，但增加了系统复杂度。对于大部分业务系统，CQRS + 传统架构已经足够，去事件化设计可以降低学习成本和维护成本。

#### Q: 如何自定义代码生成模板？

A: 可以通过修改 Freemarker 模板文件来自定义代码生成。模板文件位于 `haoric-ddd-generator/templates/` 目录下。

#### Q: 支持哪些数据库？

A: 目前支持 MySQL、PostgreSQL、SQLite 等主流数据库，可以通过配置进行切换。

#### Q: 如何添加新的聚合根？

A: 在生成器界面中添加聚合根定义，或者手动在生成的代码中添加聚合根类。

### 🐛 故障排除

#### 1. 构建失败

```bash
# 清理缓存
./mvnw clean
cargo clean

# 重新构建
./mvnw install
cargo build
```

#### 2. 启动失败

```bash
# 检查端口占用
netstat -an | grep 60001

# 检查 Java 版本
java -version

# 检查 Rust 版本
rustc --version
```

#### 3. 模板渲染错误

```bash
# 检查模板语法
# 确保变量名正确
# 检查文件编码为 UTF-8
```

## 🤝 开源贡献

### 📋 贡献指南

我们欢迎所有形式的贡献！请查看我们的贡献指南：

- **贡献指南**: [CONTRIBUTING.md](./CONTRIBUTING.md)
- **开发规范**: [DEVELOPMENT.md](./DEVELOPMENT.md)
- **代码规范**: [CODE_OF_CONDUCT.md](./CODE_OF_CONDUCT.md)

### 🐛 问题反馈

如果您发现了问题或有改进建议，请通过以下方式联系我们：

- **GitHub Issues**: [https://github.com/org-haoric/haoric-ddd/issues](https://github.com/org-haoric/haoric-ddd/issues)
- **GitHub
  Discussions**: [https://github.com/org-haoric/haoric-ddd/discussions](https://github.com/org-haoric/haoric-ddd/discussions)
- **邮箱联系**: haoric@example.com

### 🌟 功能请求

如果您有新的功能想法，请：

1. 在 [GitHub Issues](https://github.com/org-haoric/haoric-ddd/issues) 中创建功能请求
2. 详细描述您的需求和用例
3. 提供相关的技术背景

### 🧪 测试反馈

我们重视测试反馈，请：

1. 在不同环境下测试项目
2. 报告发现的问题
3. 提供详细的复现步骤

## 📄 许可证

本项目基于 **Apache License 2.0** 许可协议发布。

- 📄 查看完整协议内容请访问：[https://www.apache.org/licenses/LICENSE-2.0](https://www.apache.org/licenses/LICENSE-2.0)
- 📁 或查阅仓库中的 [LICENSE](./LICENSE) 文件。

### 🔓 开源承诺

- ✅ **完全开源**: 所有代码和文档都开源
- ✅ **社区驱动**: 欢迎社区贡献和反馈
- ✅ **透明开发**: 开发过程完全透明
- ✅ **持续更新**: 定期更新和维护

## 🙏 致谢

### 🏆 核心贡献者

感谢所有为项目做出贡献的开发者：

- **项目维护者**: [@haoric-team](https://github.com/haoric-team)
- **核心开发者**: [@ddd-experts](https://github.com/ddd-experts)
- **社区贡献者**: [贡献者列表](https://github.com/org-haoric/haoric-ddd/graphs/contributors)

### 📚 参考资源

本项目参考或集成了以下优秀开源组件：

- [Spring Boot](https://spring.io/projects/spring-boot) - Java Web 框架
- [Tauri](https://tauri.app/) - 桌面应用框架
- [Bootstrap](https://getbootstrap.com/) - UI 框架
- [Freemarker](https://freemarker.apache.org/) - 模板引擎
- [Lombok](https://projectlombok.org/) - 简化 Java 代码

### 🎓 学术支持

领域驱动设计相关思想与资料来自：

- **Eric Evans** - 《领域驱动设计》
- **DDD 社区** - 领域驱动设计实践者社区
- **Spring 社区** - Spring 生态系统

## ☕ 支持我们

如果您觉得本项目对您有帮助，请考虑支持我们：

### 💰 赞助支持

- **GitHub Sponsors**: [https://github.com/sponsors/org-haoric](https://github.com/sponsors/org-haoric)
- **Buy Me a Coffee**: [https://www.buymeacoffee.com/haoric](https://www.buymeacoffee.com/haoric)

### 🌟 其他支持方式

- ⭐ **给项目点星**: 在 GitHub 上给项目点星
- 🔄 **分享项目**: 在社交媒体上分享项目
- 📝 **写教程**: 编写使用教程和最佳实践
- 🐛 **报告问题**: 帮助发现和修复问题

---

**Happy Coding! 🚀**

---

<div align="center">

**如果这个项目对您有帮助，请给我们一个 ⭐️**

[![GitHub stars](https://img.shields.io/github/stars/org-haoric/haoric-ddd?style=social)](https://github.com/org-haoric/haoric-ddd)
[![GitHub forks](https://img.shields.io/github/forks/org-haoric/haoric-ddd?style=social)](https://github.com/org-haoric/haoric-ddd)
[![GitHub issues](https://img.shields.io/github/issues/org-haoric/haoric-ddd)](https://github.com/org-haoric/haoric-ddd/issues)
[![GitHub license](https://img.shields.io/github/license/org-haoric/haoric-ddd)](https://github.com/org-haoric/haoric-ddd/blob/main/LICENSE)

</div>


---
