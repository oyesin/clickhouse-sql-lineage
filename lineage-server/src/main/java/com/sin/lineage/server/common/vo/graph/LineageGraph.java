/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sin.lineage.server.common.vo.graph;

import com.sin.lineage.server.common.vo.graph.link.basic.Link;
import com.sin.lineage.server.common.vo.graph.vertex.Vertex;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@Accessors(chain = true)
public class LineageGraph {

    private List<Vertex> nodes;

    private List<Link> links;

    public LineageGraph() {
        this.nodes = new ArrayList<>();
        this.links = new ArrayList<>();
    }

    public void addLink(Link link) {
        this.links.add(link);
    }

    public void addVertex(Vertex vertex) {
        if (!this.nodes.contains(vertex)) {
            this.nodes.add(vertex);
        }
    }

    public Vertex getVertexByName(String name) {
        Optional<Vertex> result = nodes.stream()
                .filter(vertex -> vertex.getName().equals(name))
                .findFirst();

        if (result.isPresent()) {
            return result.get();
        } else {
            Vertex vertex = new Vertex(name);
            nodes.add(vertex);
            return vertex;
        }
    }
}
